package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginStageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginButton;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;


    @FXML
    void loginAction(ActionEvent event) throws IOException {
        if(checkLoginAndPassword(loginField.getText(), passwordField.getText())){
            /* close this window */
            ((Node)(event.getSource())).getScene().getWindow().hide();
            openMainStage();
        }
        else
            showErrorMsg();
    }
    
    /**
     * Sprawdź czy podany login i hasło są poprawne
     * @param login
     * @param password
     * @return 
     */
    boolean checkLoginAndPassword(String login, String password){
        return true;
    }
    
    /**
     * Otwórz główne okno programu
     * @throws IOException 
     */
    private void openMainStage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainStage.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("System PIGUŁA");
        stage.show();
    }

    /**
     * Pokaż informację o nieudanym logowaniu
     */
    private void showErrorMsg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    void initialize() {
        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'LoginStage.fxml'.";
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'LoginStage.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'LoginStage.fxml'.";
    }
}
