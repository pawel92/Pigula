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
import model.dbo.DbProperties;
import static model.dbo.Tables.*;
import org.jooq.Record;
import org.jooq.Result;
import view.DialogFactory;


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
        String pesel = checkLoginAndPassword(loginField.getText(), passwordField.getText());
        if(pesel != null){
            /* zamknij okno logowania */
            ((Node)(event.getSource())).getScene().getWindow().hide();
            /* pokaż okno główne */
            openMainStage(pesel);
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
    String checkLoginAndPassword(String login, String password){
        Result<Record> result = DbProperties.getInstance().getDsl().select()
                                           .from(PRACOWNIK)
                                           .where(PRACOWNIK.PESEL.equal(login))
                                           .and("pracownik.haslo = CONVERT(NVARCHAR(32),HashBytes('MD5', '"+password+"'),2)")
                                           .fetch();
        if(result.isEmpty())
            return null;
        else
            return result.getValue(0, PRACOWNIK.PESEL);
    }
    
    /**
     * Otwórz główne okno programu
     * @throws IOException 
     */
    private void openMainStage(String pesel) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("/view/MainStage.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainStage.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("System PIGUŁA");
        
        MainStageController controller = (MainStageController)loader.getController();
        controller.prepareView(pesel);
        stage.show();
    }

    /**
     * Pokaż informację o nieudanym logowaniu
     */
    private void showErrorMsg() {
          DialogFactory.getInstance().showError("Błąd logowania", "Wprowadzono błędny login lub hasło");
    }

    @FXML
    void initialize() {
        assert loginButton != null : "fx:id=\"loginButton\" was not injected: check your FXML file 'LoginStage.fxml'.";
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'LoginStage.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'LoginStage.fxml'.";
    }
}
