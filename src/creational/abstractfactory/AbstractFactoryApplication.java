package creational.abstractfactory;

/**
 * AbstractFactoryApplication Class
 *
 * @author a.slepakurov
 * @version 8/9/15
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AbstractFactoryApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("resources/abstractfactory.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Absract Factory Application");
        primaryStage.setScene(new Scene(root, 750, 400));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
