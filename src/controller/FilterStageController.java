package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;


public class FilterStageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button clearProviderButton;

    @FXML
    private TextField containsComponentField;

    @FXML
    private Button filtersOffButton;

    @FXML
    private Button filtersOnButton;

    @FXML
    private TextField nameField;

    @FXML
    private CheckBox onlyAvailableItemsCheckbox;

    @FXML
    private TextField providerField;


    @FXML
    void clearProviderAction(ActionEvent event) {
    }

    @FXML
    void filtersOffAction(ActionEvent event) {
    }

    @FXML
    void filtersOnAction(ActionEvent event) {
    }

    @FXML
    void onlyAvailableItemsCheckboxAction(ActionEvent event) {
    }

    @FXML
    void providerFieldDragDropped(DragEvent event) {
    }

    @FXML
    void initialize() {
        assert clearProviderButton != null : "fx:id=\"clearProviderButton\" was not injected: check your FXML file 'FilterStage.fxml'.";
        assert containsComponentField != null : "fx:id=\"containsComponentField\" was not injected: check your FXML file 'FilterStage.fxml'.";
        assert filtersOffButton != null : "fx:id=\"filtersOffButton\" was not injected: check your FXML file 'FilterStage.fxml'.";
        assert filtersOnButton != null : "fx:id=\"filtersOnButton\" was not injected: check your FXML file 'FilterStage.fxml'.";
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'FilterStage.fxml'.";
        assert onlyAvailableItemsCheckbox != null : "fx:id=\"onlyAvailableItemsCheckbox\" was not injected: check your FXML file 'FilterStage.fxml'.";
        assert providerField != null : "fx:id=\"providerField\" was not injected: check your FXML file 'FilterStage.fxml'.";


    }

}
