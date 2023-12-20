package com.example.basecalculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Launcher extends Application {

    public TextField UserInput;
    public Label OutputPanel;

    public Button BinaryButton;
    public Button Hexadecimal;
    public Button OctalButton;
    public Button exitButton;
    public Button ClearButton;

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("/view/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Base Conversion Calculator");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

    public void UserInput(ActionEvent actionEvent) {

    }

    public void BinaryButton(ActionEvent actionEvent) {

    }

    public void Hexadecimal(ActionEvent actionEvent) {

    }

    public void OctalButton(ActionEvent actionEvent) {

    }

    public void exitButton(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void ClearButton(ActionEvent actionEvent) {
        UserInput.setText("");
        OutputPanel.setText("             No Input");
    }
}
