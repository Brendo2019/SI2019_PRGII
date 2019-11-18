package br.edu.unisep;

import br.edu.unisep.music.GroupPlan;
import br.edu.unisep.music.Plan;
import br.edu.unisep.music.StandardPlan;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.text.DecimalFormat;

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

    private Plan musicPlan;

    public void onTypeChange(ActionEvent event) {
        paneStandard.setVisible(rdStandard.isSelected());
        paneGroup.setVisible(!rdStandard.isSelected());
    }

    public void calculate(ActionEvent event) {

        if (rdStandard.isSelected()) {
            musicPlan = new StandardPlan();
            buildStandardPlan();
        } else {
            musicPlan = new GroupPlan();
            buildGroupPlan();
        }

        var result = musicPlan.calculateValue();

        var df = new DecimalFormat("#,##0.00");
        lblResult.setText("R$ " + df.format(result));
    }

    private void buildGroupPlan() {
        var groupPlan = (GroupPlan) musicPlan;
        groupPlan.setMembers(Integer.valueOf(txtMembers.getText()));
        groupPlan.setMultipleAccess(chkMultipleAccess.isSelected());
    }

    private void buildStandardPlan() {
        var standardPlan = (StandardPlan) musicPlan;
        standardPlan.setDevices(Integer.valueOf(txtDevices.getText()));

        if (rdBasic.isSelected()) {
            standardPlan.setType(1);
        } else if (rdIntermediate.isSelected()) {
            standardPlan.setType(2);
        } else {
            standardPlan.setType(3);
        }
    }

}
