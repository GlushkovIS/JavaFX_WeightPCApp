package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MainWindowController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField weightInput;

    @FXML
    private Button sendWeigthButton;

    @FXML
    private Button chengeDataButton;

    @FXML
    private Button settingButton;

    @FXML
    private Text helloUser;

    @FXML
    void initialize() {
    }
}