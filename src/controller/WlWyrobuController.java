/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class WlWyrobuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addIngredientButton;

    @FXML
    private Label amountLabel;

    @FXML
    private TextField amountTextF;

    @FXML
    private Label availabilityLabel;

    @FXML
    private TextField availabilityTextF;

    @FXML
    private Label historyLabel;

    @FXML
    private TableColumn<?, ?> ingTblDoseCol;

    @FXML
    private TableColumn<?, ?> ingTblIngCol;

    @FXML
    private TableColumn<?, ?> ingTblUnitCol;

    @FXML
    private Label ingredientsLabel;

    @FXML
    private TableView<?> ingredientsTable;

    @FXML
    private Label itemTypeLabel;

    @FXML
    private SplitMenuButton itemTypeMenu;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nameTextF;

    @FXML
    private TextField newIngredientTextF;

    @FXML
    private TextField newProviderTextF;

    @FXML
    private Label producerLabel;

    @FXML
    private TextField producerTextF;

    @FXML
    private TableColumn<?, ?> provTblIdCol;

    @FXML
    private TableColumn<?, ?> provTblNameCol;

    @FXML
    private TableColumn<?, ?> provTblPriceCol;

    @FXML
    private Label providerLabel;

    @FXML
    private Button providerPriceButton;

    @FXML
    private Label providerPriceLabel;

    @FXML
    private TextField providerPriceTextF;

    @FXML
    private TableView<?> providersTable;

    @FXML
    private TableView<?> purchaseTable;

    @FXML
    private TableColumn<?, ?> purchaseTblDateCol;

    @FXML
    private Button purchaseTblNewPriceButton;

    @FXML
    private TextField purchaseTblNewPriceTextF;

    @FXML
    private TextField purchaseTblNewProviderTextF;

    @FXML
    private TableColumn<?, ?> purchaseTblPriceCol;

    @FXML
    private TableView<?> salesTable;

    @FXML
    private TableColumn<?, ?> salesTblDateCol;

    @FXML
    private Button salesTblNewPriceButton;

    @FXML
    private TextField salesTblNewPriceTextF;

    @FXML
    private TableColumn<?, ?> salesTblPriceCol;

    @FXML
    private SplitMenuButton unitMenu;

    @FXML
    void okButtonPressed(ActionEvent event) {
        
    }
    
    public void prepareView(String pesel, boolean addMode){
    
    }
   
    
    @FXML
    void initialize() {
        assert addIngredientButton != null : "fx:id=\"addIngredientButton\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert amountLabel != null : "fx:id=\"amountLabel\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert amountTextF != null : "fx:id=\"amountTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert availabilityLabel != null : "fx:id=\"availabilityLabel\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert availabilityTextF != null : "fx:id=\"availabilityTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert historyLabel != null : "fx:id=\"historyLabel\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert ingTblDoseCol != null : "fx:id=\"ingTblDoseCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert ingTblIngCol != null : "fx:id=\"ingTblIngCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert ingTblUnitCol != null : "fx:id=\"ingTblUnitCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert ingredientsLabel != null : "fx:id=\"ingredientsLabel\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert ingredientsTable != null : "fx:id=\"ingredientsTable\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert itemTypeLabel != null : "fx:id=\"itemTypeLabel\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert itemTypeMenu != null : "fx:id=\"itemTypeMenu\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert nameTextF != null : "fx:id=\"nameTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert newIngredientTextF != null : "fx:id=\"newIngredientTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert newProviderTextF != null : "fx:id=\"newProviderTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert producerLabel != null : "fx:id=\"producerLabel\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert producerTextF != null : "fx:id=\"producerTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert provTblIdCol != null : "fx:id=\"provTblIdCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert provTblNameCol != null : "fx:id=\"provTblNameCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert provTblPriceCol != null : "fx:id=\"provTblPriceCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert providerLabel != null : "fx:id=\"providerLabel\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert providerPriceButton != null : "fx:id=\"providerPriceButton\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert providerPriceLabel != null : "fx:id=\"providerPriceLabel\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert providerPriceTextF != null : "fx:id=\"providerPriceTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert providersTable != null : "fx:id=\"providersTable\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert purchaseTable != null : "fx:id=\"purchaseTable\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert purchaseTblDateCol != null : "fx:id=\"purchaseTblDateCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert purchaseTblNewPriceButton != null : "fx:id=\"purchaseTblNewPriceButton\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert purchaseTblNewPriceTextF != null : "fx:id=\"purchaseTblNewPriceTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert purchaseTblNewProviderTextF != null : "fx:id=\"purchaseTblNewProviderTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert purchaseTblPriceCol != null : "fx:id=\"purchaseTblPriceCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert salesTable != null : "fx:id=\"salesTable\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert salesTblDateCol != null : "fx:id=\"salesTblDateCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert salesTblNewPriceButton != null : "fx:id=\"salesTblNewPriceButton\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert salesTblNewPriceTextF != null : "fx:id=\"salesTblNewPriceTextF\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert salesTblPriceCol != null : "fx:id=\"salesTblPriceCol\" was not injected: check your FXML file 'wlWyrobu.fxml'.";
        assert unitMenu != null : "fx:id=\"unitMenu\" was not injected: check your FXML file 'wlWyrobu.fxml'.";


    }

}
