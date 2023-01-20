package controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainStart extends Application {

    public static Stage ventana;
    @Override
    public void start(Stage primaryStage) {
        try {
            this.ventana= primaryStage;
            Parent root = FXMLLoader.load(getClass().getResource("../views/loginView.fxml"));
            Scene scene = new Scene(root);
            loginController loginController = new loginController();
            this.ventana.setTitle("Login");
            this.ventana.initStyle(StageStyle.UNDECORATED); /*Para quitar la barra de titulo*/
            this.ventana.setScene(scene);
            this.ventana.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

}