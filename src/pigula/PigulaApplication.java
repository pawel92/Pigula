package pigula;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.dbo.DbProperties;

public class PigulaApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        /* połącz z bazą danych */
        DbProperties.getInstance().connect();
        
        Parent root = FXMLLoader.load(getClass().getResource("/view/LoginStage.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Logowanie do systemu");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        PigulaApplication.launch(args);
    }
}
