package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class translate_controller {

    @FXML
    TextField txt;
    @FXML
    Label lab;
    @FXML
    Label p_lab;

    public void translate() throws InterruptedException {
        lab.setText("");
        p_lab.setText("");

        int state = 0;
        String text = txt.getText();
        for(word a : DataBase.getAll_words()) {
            if (a.getTurkish().equals(text)) {
                state = 1;
                text = a.getEnglish();
                break;
            }
            if (a.getEnglish().equals(text)) {
                state = 2;
                text = a.getTurkish();
                break;
            }
        }

        if(state == 0)
            lab.setText("Bulunamadı");

        if(state == 1)
            lab.setText(text);

        if(state == 2)
            lab.setText(text);


    }

    public void IPAbutton(){
        for(word w : DataBase.getAll_words())
            if(w.getEnglish().equals(lab.getText())||w.getTurkish().equals(lab.getText()))
                p_lab.setText(w.getIpa());

    }



    public void switchToEnterancePage(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("enterance.fxml")));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
