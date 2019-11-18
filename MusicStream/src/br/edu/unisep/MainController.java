package br.edu.unisep;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML private TextField txtClient;
    @FXML private TextField txtEmail;

    @FXML private RadioButton rdStandard;

    @FXML private TextField txtMembers;
    @FXML private CheckBox chkMultipleAccess;

    @FXML private TextField txtDevices;
    @FXML private RadioButton rdBasic;
    @FXML private RadioButton rdIntermediate;

    @FXML private AnchorPane paneStandard;
    @FXML private AnchorPane paneGroup;

    @FXML private Label lblResult;

}
