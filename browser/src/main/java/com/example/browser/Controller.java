package com.example.browser;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private WebView mywebView;
    @FXML
    private TextField txt;
    @FXML
    private Button loadB;

    private WebEngine engine;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = mywebView.getEngine();
        
    }

    public void load() {
        engine.load("http://" + txt.getText());

    }

}