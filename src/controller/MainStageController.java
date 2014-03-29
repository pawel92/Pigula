package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;

/**
 * SŁOWNICZEK:
 * item = wyrób
 * producer = producent
 * provider = dostawca
 * customer = klient
 * sale = sprzedaż
 * purchase = kupno
 * complaint = reklamacja
 * employee = pracownik
 */
public class MainStageController {

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
    private TableView<?> itemsTable;

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
    void addItemAction(ActionEvent event) {
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

}


