package com.example.switcher;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Scene2Controller implements Initializable {

    @FXML
    private ListView<String> myList;
    @FXML
    private Label myLabel;

    String[] cars={"Accent", "Symbol", "Sandero"};
    String current;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myList.getItems().addAll(cars);
        myList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                current = myList.getSelectionModel().getSelectedItem();
                myLabel.setText(current);
            }
        });
    }
}
