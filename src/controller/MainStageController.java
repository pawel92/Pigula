package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.dbo.DbProperties;
import static model.dbo.Tables.CENASPRZEDAZY;
import static model.dbo.Tables.PRACOWNIK;
import static model.dbo.Tables.PRODUCENT;
import static model.dbo.Tables.RODZAJWYROBU;
import static model.dbo.Tables.WYROB;
import model.dbo.tables.Wyrob;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record6;
import org.jooq.Result;

/**
 * SŁOWNICZEK: item = wyrób producer = producent provider = dostawca customer =
 * klient sale = sprzedaż purchase = kupno complaint = reklamacja employee =
 * pracownik
 */
public class MainStageController {
    private DSLContext create = DbProperties.getInstance().getDsl();
    private Wyrob myTable = WYROB.as("wyr");
    private Result<Record6<Integer, String, String, Double, String, Integer>> itemsResult1;
    private ObservableList<Item> itemsDataTable;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addComplaintButton;

    @FXML
    private Button addCustomerButton;

    @FXML
    private Button addEmployeeButton;

    @FXML
    private Button addItemButton;

    @FXML
    private Button addProducerButton;

    @FXML
    private Button addProviderButton;

    @FXML
    private Button addPurchaseButton;

    @FXML
    private Button addSaleButton;

    @FXML
    private TableView<?> complaintsTable;

    @FXML
    private TableView<?> customersTable;

    @FXML
    private Button deleteComplaintsButton;

    @FXML
    private Button deleteCustomersButton;

    @FXML
    private Button deleteEmployeesButton;

    @FXML
    private Button deleteItemsButton;

    @FXML
    private Button deleteProducersButton;

    @FXML
    private Button deleteProvidersButton;

    @FXML
    private Button deletePurchasesButton;

    @FXML
    private Button deleteSalesButton;

    @FXML
    private TableView<?> employeesTable;

    @FXML
    private Button filterButton;

    @FXML
    private Label filterLabel;

    @FXML
    private TableView<Item> itemsTable;

    @FXML
    private TableColumn itemsTableId;

    @FXML
    private TableColumn itemsTableName;

    @FXML
    private TableColumn itemsTableProducer;

    @FXML
    private TableColumn itemsTableUnitPrice;

    @FXML
    private TableColumn itemsTableType;

    @FXML
    private TableColumn itemsTableAvailability;

    @FXML
    private Button logoutButton;

    @FXML
    private TableView<?> producersTable;

    @FXML
    private TableView<?> providersTable;

    @FXML
    private TableView<?> purchasesTable;

    @FXML
    private Button refreshButton;

    @FXML
    private TableView<?> salesTable;

    @FXML
    private CheckBox showOnlyNotFinishComplaintsCheckbox;

    @FXML
    private CheckBox showOnlyNotFinishPurchasesCheckbox;

    @FXML
    private CheckBox showOnlyNotFinishSalesCheckbox;

    @FXML
    private Label whoItIsLabel;

    @FXML
    private Tab employeesTab;

    /**
     * PESEL pracownika, który aktualnie korzysta z aplikacji
     */
    private String peselOfEmployee;

    public void prepareView(String pesel) {
        //------wypelnianie tabeli---------
        itemsTablePrepareColumns();
        updateItemsTable();
        //-------koniec wypelniania tabeli
        
        //dodanie słuchacza elementu tabeli wyrobów
        itemsTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        itemsTable.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
                public void handle(MouseEvent event) {
                    if (event.getClickCount()==2) {
                        //double click!
                        ObservableList<TablePosition> cell = itemsTable.getSelectionModel().getSelectedCells();
                        int indexOfClickedItem = cell.get(0).getRow();
                        Item itemClicked = itemsDataTable.get(indexOfClickedItem);
                        try {
                            openWlWyrobu(peselOfEmployee, false, itemClicked);
                        } catch (IOException ex) {}
                    }
                }
            });
        //koniec dodawania słuchacza do tabeli wyrobów
        peselOfEmployee = pesel;
        if (peselOfEmployee.equals("root")) {
            whoItIsLabel.setText("Zalogowany użytkownik: root");
            return;
        }
        Result<Record> result = DbProperties.getInstance().getDsl().select()
                .from(PRACOWNIK)
                .where(PRACOWNIK.PESEL.equal(peselOfEmployee))
                .fetch();
        /* Ustawienie informacji w górnej belce programu o zalogowanym użytkowniku */
        whoItIsLabel.setText("Zalogowany użytkownik: "
                + result.getValue(0, PRACOWNIK.IMIE)
                + " " + (result.getValue(0, PRACOWNIK.NAZWISKO)));
        /* Wyłącz zakładkę "Pracownicy" dla pracownika */
        employeesTab.setDisable(true);

    }
/**
 * 
 * @param pesel ID otwierajacego okno
 * @param addMode true-dodanie nowego towaru, false-edycja
 * 
 */
    private void openWlWyrobu(String pesel, boolean addMode, Item item) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("/view/MainStage.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/wlWyrobu.fxml"));
        //System.out.println(loader==null);
        Parent root = loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
         
        stage.setScene(scene);
        if(addMode){
            stage.setTitle("Dodaj wyrób");}
        else{
            stage.setTitle("Edytuj wyrób");
        }
        WlWyrobuController controller = (WlWyrobuController)loader.getController();
        controller.prepareView(pesel,addMode,item);
        stage.show();
    }
    
    @FXML
    void addComplaintAction(ActionEvent event) {
    }

    @FXML
    void addCustomerAction(ActionEvent event) {
    }

    @FXML
    void addEmployeeAction(ActionEvent event) {
    }

    @FXML
    void addItemAction(ActionEvent event) throws IOException {
        openWlWyrobu(peselOfEmployee, true, null);
    }

    @FXML
    void addProducerAction(ActionEvent event) {
    }

    @FXML
    void addProviderAction(ActionEvent event) {
    }

    @FXML
    void addPurchaseAction(ActionEvent event) {
    }

    @FXML
    void addSaleAction(ActionEvent event) {
    }

    @FXML
    void deleteComplaintsAction(ActionEvent event) {
    }

    @FXML
    void deleteCustomersAction(ActionEvent event) {
    }

    @FXML
    void deleteEmployeesAction(ActionEvent event) {
    }

    @FXML
    void deleteItemsAction(ActionEvent event) {
    }

    @FXML
    void deleteProducersAction(ActionEvent event) {
    }

    @FXML
    void deleteProvidersAction(ActionEvent event) {
    }

    @FXML
    void deletePurchasesAction(ActionEvent event) {
    }

    @FXML
    void deleteSalesAction(ActionEvent event) {
    }

    @FXML
    void filterItemsAction(ActionEvent event) {
    }

    @FXML
    void logoutAction(ActionEvent event) {
    }

    @FXML
    void refreshAction(ActionEvent event) {
    }

    @FXML
    void showOnlyNotFinishComplaintsCheckboxAction(ActionEvent event) {
    }

    @FXML
    void showOnlyNotFinishPurchasesCheckboxAction(ActionEvent event) {
    }

    @FXML
    void showOnlyNotFinishSalesCheckboxAction(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert addComplaintButton != null : "fx:id=\"addComplaintButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert addCustomerButton != null : "fx:id=\"addCustomerButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert addEmployeeButton != null : "fx:id=\"addEmployeeButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert addItemButton != null : "fx:id=\"addItemButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert addProducerButton != null : "fx:id=\"addProducerButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert addProviderButton != null : "fx:id=\"addProviderButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert addPurchaseButton != null : "fx:id=\"addPurchaseButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert addSaleButton != null : "fx:id=\"addSaleButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert complaintsTable != null : "fx:id=\"complaintsTable\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert customersTable != null : "fx:id=\"customersTable\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert deleteComplaintsButton != null : "fx:id=\"deleteComplaintsButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert deleteCustomersButton != null : "fx:id=\"deleteCustomersButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert deleteEmployeesButton != null : "fx:id=\"deleteEmployeesButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert deleteItemsButton != null : "fx:id=\"deleteItemsButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert deleteProducersButton != null : "fx:id=\"deleteProducersButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert deleteProvidersButton != null : "fx:id=\"deleteProvidersButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert deletePurchasesButton != null : "fx:id=\"deletePurchasesButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert deleteSalesButton != null : "fx:id=\"deleteSalesButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert employeesTable != null : "fx:id=\"employeesTable\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert filterButton != null : "fx:id=\"filterButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert filterLabel != null : "fx:id=\"filterLabel\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert itemsTable != null : "fx:id=\"itemsTable\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert logoutButton != null : "fx:id=\"logoutButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert producersTable != null : "fx:id=\"producersTable\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert providersTable != null : "fx:id=\"providersTable\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert purchasesTable != null : "fx:id=\"purchasesTable\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert refreshButton != null : "fx:id=\"refreshButton\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert salesTable != null : "fx:id=\"salesTable\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert showOnlyNotFinishComplaintsCheckbox != null : "fx:id=\"showOnlyNotFinishComplaintsCheckbox\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert showOnlyNotFinishPurchasesCheckbox != null : "fx:id=\"showOnlyNotFinishPurchasesCheckbox\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert showOnlyNotFinishSalesCheckbox != null : "fx:id=\"showOnlyNotFinishSalesCheckbox\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert whoItIsLabel != null : "fx:id=\"whoItIsLabel\" was not injected: check your FXML file 'MainStage.fxml'.";
        assert employeesTab != null : "fx:id=\"employeesTab\" was not injected: check your FXML file 'MainStage.fxml'.";

    }
    
    private void itemsTablePrepareColumns(){
        itemsTableId.setCellValueFactory(
                new PropertyValueFactory<Item, String>("itemsTableId"));
        itemsTableName.setCellValueFactory(
                new PropertyValueFactory<Item, String>("itemsTableName"));
        itemsTableProducer.setCellValueFactory(
                new PropertyValueFactory<Item, String>("itemsTableProducer"));
        itemsTableUnitPrice.setCellValueFactory(
                new PropertyValueFactory<Item, String>("itemsTableUnitPrice"));
        itemsTableType.setCellValueFactory(
                new PropertyValueFactory<Item, String>("itemsTableType"));
        itemsTableAvailability.setCellValueFactory(
                new PropertyValueFactory<Item, String>("itemsTableAvailability"));
    }
    
    private void updateItemsTable(){
    itemsResult1 = create.select(myTable.ID, myTable.NAZWA, PRODUCENT.NAZWA, CENASPRZEDAZY.CENABRUTTO, RODZAJWYROBU.RODZAJ, myTable.ILOSCDOSTEPNYCH)
            .from(myTable)
            .join(CENASPRZEDAZY).on(myTable.ID.equal(CENASPRZEDAZY.IDWYROBU))
            .join(PRODUCENT).on(myTable.PRODUCENTID.equal(PRODUCENT.ID))
            .join(RODZAJWYROBU).on(RODZAJWYROBU.ID.equal(myTable.RODZAJWYROBUID))
            .where(CENASPRZEDAZY.ID
                    .equal(create.select(CENASPRZEDAZY.ID)
                            .from(CENASPRZEDAZY)
                            .where(CENASPRZEDAZY.IDWYROBU.equal(myTable.ID))
                            .orderBy(CENASPRZEDAZY.DATAZMIANY.desc()).limit(1)))
            .fetch();
        itemsDataTable = Item.getObservableList(itemsResult1);
        itemsTable.setItems(itemsDataTable);
    }
    /**
     * Klasa przechowujaca wiersz tabeli wyrobów
     */
    public static class Item {

        private SimpleStringProperty itemsTableId;
        private SimpleStringProperty itemsTableName;
        private SimpleStringProperty itemsTableProducer;
        private SimpleStringProperty itemsTableUnitPrice;
        private SimpleStringProperty itemsTableType;
        private SimpleStringProperty itemsTableAvailability;

        public Item(String id, String name, String producer, String unitPrice, String type, String availability) {
            this.itemsTableId = new SimpleStringProperty(id);
            this.itemsTableName = new SimpleStringProperty(name);
            this.itemsTableProducer = new SimpleStringProperty(producer);
            this.itemsTableUnitPrice = new SimpleStringProperty(unitPrice);
            this.itemsTableType = new SimpleStringProperty(type);
            this.itemsTableAvailability = new SimpleStringProperty(availability);
        }

        /**
         * Metoda zamienia obiekt typu Result na ObservableList<Item>
         *
         * @param tResult Zmienna z wynikiem pobranym z bazy danych.
         * @return Obiekt typu ObservableList stworzony z wyniku z bazy danych
         */
        public static ObservableList<Item> getObservableList(Result<Record6<Integer, String, String, Double, String, Integer>> tResult/*Result<Record> tResult*/) {
            ObservableList<Item> tmpList = FXCollections.observableArrayList();
            Object[][] values = tResult.intoArray();
            for (int i = 0; i < values.length; i++) {
                tmpList.add(new Item(values[i][0].toString(), values[i][1].toString(), values[i][2].toString(), values[i][3].toString(), values[i][4].toString(), values[i][5].toString()));
            }
            return tmpList;
        }

        /**
         * @return the itemsTableId
         */
        public String getItemsTableId() {
            return itemsTableId.get();
        }

        /**
         * @param itemsTableName the itemsTableName to set
         */
        public void setItemsTableId(SimpleStringProperty itemsTableId) {
            this.itemsTableId = itemsTableId;
        }

        /**
         * @return the itemsTableName
         */
        public String getItemsTableName() {
            return itemsTableName.get();
        }

        /**
         * @param itemsTableName the itemsTableName to set
         */
        public void setItemsTableName(SimpleStringProperty itemsTableName) {
            this.itemsTableName = itemsTableName;
        }

        /**
         * @return the itemsTableProducer
         */
        public String getItemsTableProducer() {
            return itemsTableProducer.get();
        }

        /**
         * @param itemsTableProducer the itemsTableProducer to set
         */
        public void setItemsTableProducer(SimpleStringProperty itemsTableProducer) {
            this.itemsTableProducer = itemsTableProducer;
        }

        /**
         * @return the itemsTableUnitPrice
         */
        public String getItemsTableUnitPrice() {
            return itemsTableUnitPrice.get();
        }

        /**
         * @param itemsTableUnitPrice the itemsTableUnitPrice to set
         */
        public void setItemsTableUnitPrice(SimpleStringProperty itemsTableUnitPrice) {
            this.itemsTableUnitPrice = itemsTableUnitPrice;
        }

        /**
         * @return the itemsTableType
         */
        public String getItemsTableType() {
            return itemsTableType.get();
        }

        /**
         * @param itemsTableType the itemsTableType to set
         */
        public void setItemsTableType(SimpleStringProperty itemsTableType) {
            this.itemsTableType = itemsTableType;
        }

        /**
         * @return the itemsTableAvailability
         */
        public String getItemsTableAvailability() {
            return itemsTableAvailability.get();
        }

        /**
         * @param itemsTableAvailability the itemsTableAvailability to set
         */
        public void setItemsTableAvailability(SimpleStringProperty itemsTableAvailability) {
            this.itemsTableAvailability = itemsTableAvailability;
        }
    }

}
