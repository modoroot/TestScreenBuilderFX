package controller;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class LoginController {

    @FXML // fx:id="btnLogin"
    private Button btnLogin; // Value injected by FXMLLoader

    @FXML // fx:id="emailField"
    private TextField emailField; // Value injected by FXMLLoader

    @FXML // fx:id="passwordField"
    private PasswordField passwordField; // Value injected by FXMLLoader

    @FXML // fx:id="emailLabel"
    private Label emailLabel; // Value injected by FXMLLoader

    @FXML // fx:id="passwordLabel"
    private Label passwordLabel; // Value injected by FXMLLoader

    @FXML // fx:id="img"
    private ImageView img; // Value injected by FXMLLoader

    @FXML
    void login(ActionEvent event)
    {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Autentificación");
        alert.setHeaderText(null);
        String email = "j1@gmail.com";
        String password = "1234";
        if(emailField.getText().equals(email) &&
                passwordField.getText().equals(password))
        {
            alert.setContentText("El usuario y contraseña es correcto");
        }
        else
        {
            alert.setContentText("El usuario y contraseña es incorrecto");
        }
        alert.showAndWait();
    }

}
