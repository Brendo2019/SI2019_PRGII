package br.edu.unisep;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML private TextField txtName;

    @FXML private Label lblMessage;

    public void sayHello(ActionEvent event) {
        lblMessage.setText("Hello, " + txtName.getText());
    }

}
