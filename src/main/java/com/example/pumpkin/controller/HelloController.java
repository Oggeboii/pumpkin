package com.example.pumpkin.controller;

import com.example.pumpkin.model.Model;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    //This method will run after the controller object is created
    //and the fields are initialized.
    public void initialize() {
        textFieldTarget.textProperty().bind(model.userTextProperty());
        //transferButton.disableProperty().bind(textField.textProperty().isEmpty());
    }

    private Model model = new Model();

    public Button transferButton;

    public TextField textField;

    public TextField textFieldTarget;

    public Model getModel() {
        return model;
    }

    @FXML
    protected void transferButtonAction() {
        model.setUserText(textField.getText());
    }
}
