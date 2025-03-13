package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Info_controller {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label myc;
    @FXML
    Label vec;

    @FXML
    Label ide;


    public void initialize(){
    myc.setText(String.valueOf(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size()));
    vec.setText(String.valueOf(DataBase.getStudent(HelloController.getSavedID()).getVe_learned().size()));

    }
    public void viewmy(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("mylistview.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    public void switchToBackPage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hunter.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

