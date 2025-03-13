package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.*;
import java.util.Objects;

public class mywords_controller {
    private int ID=HelloController.getSavedID();
    @FXML
    TextField TurkishText;
    @FXML
    TextField EnglishText;
    @FXML
    Label label;

    String TurkishOldval="";
    String EnglishOldval="";
    public void add_word(){
        if(TurkishText.getText().isEmpty()
                || EnglishText.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Please fill all the texts");
            alert.showAndWait();
        }
        else{
            boolean state = true;
            for(word a : DataBase.getStudent(ID).get_mylist()) {
                if(a.getTurkish().equals(TurkishText.getText())
                        || a.getEnglish().equals(EnglishText.getText())){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("This word already exists");
                    state=false;
                    alert.showAndWait();
                }
            }
            if(state){
                TurkishOldval=TurkishText.getText();
                EnglishOldval=EnglishText.getText();
                Student std = DataBase.getStudent(ID);
                std.add_mylist(new word(TurkishText.getText(),EnglishText.getText()));
                label.setText("Word succesfully added to Library");

            }
        }
    }

    public void pop_word(){
        if(TurkishText.getText().isEmpty() || EnglishText.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Please fill all the texts");
            alert.showAndWait();
        }
        else{
            if (DataBase.getStudent(ID).get_mylist().size() <= 1) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("There is only one word left, you cant delete it");
                alert.showAndWait();
            } else {
                word remove= null;

                for (word a : DataBase.getStudent(ID).get_mylist()) {
                    if (a.getTurkish().equals(TurkishText.getText()) && a.getEnglish().equals(EnglishText.getText())) {
                        remove = a;
                        break;
                    }
                }
                if(remove!=null){
                    DataBase.getStudent(HelloController.getSavedID()).pop_mylist(remove);
                    for (word a1 : DataBase.getStudent(ID).get_mylist()) {
                        System.out.println(a1.getTurkish() + " " + a1.getEnglish() + "\n");
                    }
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information");
                    alert.setContentText("Word deleted successfully");
                    alert.showAndWait();
                    TurkishText.clear();
                    EnglishText.clear();
                    TurkishOldval="";
                    EnglishOldval="";
                }
                else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("These words are not same");
                    alert.showAndWait();
                }

            }
        }
    }

    public void translate(){
        if(!EnglishOldval.equals(EnglishText.getText())
                && TurkishOldval.equals(TurkishText.getText())){
            label.setText("");
            boolean state = true;
            for(word a : DataBase.getStudent(ID).get_mylist()) {
                if(a.getEnglish().equals(EnglishText.getText())){
                    TurkishText.setText(a.getTurkish());
                    TurkishOldval=TurkishText.getText();
                    EnglishOldval=EnglishText.getText();
                    state=false;
                }
            }
            if(state){
                Alert state1 = new Alert(Alert.AlertType.ERROR);
                state1.setTitle("There is no Translation");
                state1.setContentText("This word is not in database");
                state1.showAndWait();
            }
        }
        else if(!TurkishOldval.equals(TurkishText.getText())
                && EnglishOldval.equals(EnglishText.getText())){
            label.setText("");
            boolean state = true;
            for(word a : DataBase.getStudent(ID).get_mylist()) {
                if(a.getTurkish().equals(TurkishText.getText())){
                    EnglishText.setText(a.getEnglish());
                    TurkishOldval=TurkishText.getText();
                    EnglishOldval=EnglishText.getText();
                    state=false;
                }
            }
            if(state){
                Alert state1 = new Alert(Alert.AlertType.ERROR);
                state1.setTitle("There is no Translation");
                state1.setContentText("This word is not in database");
                state1.showAndWait();
            }

        }
        else if((TurkishText.getText().isEmpty()
                    && EnglishText.getText().isEmpty())
                        || TurkishOldval.equals(TurkishText.getText())
                            && EnglishOldval.equals(EnglishText.getText())){
            label.setText("Please enter a word");
        }
        else{
            Alert state1 = new Alert(Alert.AlertType.ERROR);
            state1.setTitle("There is no Translation");
            state1.setContentText("This word is not in database");
            state1.showAndWait();
        }
    }

    public void switchToEnterancePage(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("enterance.fxml")));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
