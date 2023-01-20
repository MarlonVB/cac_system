package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class loginController implements Initializable {

    @FXML
    private Button closeButton;

    @FXML
    private Button minimizeButton;

    @FXML
    private Button maximizeButton;

    @FXML
    private Button loginButton;

    @FXML
    private BorderPane mainPanel;

    // Declaración de variable de tipo Stage para almacenar la ventana actual
    private Stage window;

    //Declare window state
    boolean isMaximized = false;


    @FXML
    void close(ActionEvent event) {
        // Obtener la ventana actual a través del panel principal
        window = (Stage) mainPanel.getScene().getWindow();
        if (window != null) {
            // Cerrar la ventana
            window.close();
        }
    }

    @FXML
    void login(ActionEvent event) throws Exception{
        System.out.println("Login");
        Stage stage = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource("../views/homeView.fxml"));
        Scene scene = new Scene(root);

        stage.setTitle("Home");
        //stage.initStyle(StageStyle.UNDECORATED); /*Para quitar la barra de titulo*/
        stage.setScene(scene);
        stage.show();

        this.close(event);
    }


    @FXML
    void maximize(ActionEvent event) {
        // Obtener la ventana actual a través del panel principal
        window = (Stage) mainPanel.getScene().getWindow();
        if (window != null) {
            // Verificar si la ventana está maximizada
            if(isMaximized) {
                // Si está maximizada, establecer como no maximizada
                window.setMaximized(false);
                isMaximized = false;
            } else {
                // Si no está maximizada, establecer como maximizada
                window.setMaximized(true);
                isMaximized = true;
            }
        }
    }

    @FXML
    void minimize(ActionEvent event) {
        // Obtener la ventana actual a través del panel principal
        window = (Stage) mainPanel.getScene().getWindow();
        // Minimizar la ventana
        window.setIconified(true);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}