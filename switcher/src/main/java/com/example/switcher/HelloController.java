package com.example.switcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField txt;

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void SScene2(ActionEvent event) throws IOException {
        String name = txt.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Azul.fxml"));
        root = loader.load();
        //root = FXMLLoader.load(getClass().getResource("Azul.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}