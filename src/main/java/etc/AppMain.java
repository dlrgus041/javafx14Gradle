package etc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/AppMain.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("AppMain");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
