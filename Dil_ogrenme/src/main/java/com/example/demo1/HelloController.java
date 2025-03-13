package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class HelloController {
    static int ID;
    private Stage stage;

    private Scene scene;

    private Parent root;

    @FXML
    TextField text;
    @FXML
    PasswordField pass;
    @FXML
    Label username_label;
    @FXML
    Label pass_label;
    @FXML
    Button giris;
    public static int getSavedID(){
        return ID;
    }

/*public void switchToMainPage(ActionEvent e) throws IOException {
root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("enterance.fxml")));
stage = (Stage)((Node)e.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}*/

public void switchToInfPage(ActionEvent e) throws IOException {
    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("informations.fxml")));
    stage = (Stage)((Node)e.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}

public void switchToLogPage(ActionEvent e) throws IOException {
    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
    stage = (Stage)((Node)e.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}

public void compare() throws IOException {
    int state = 0; // 0: Kullanıcı bulunamadı, 1: Kullanıcı adı doğru, 2: Giriş başarılı
    for (Student s : DataBase.getStudent()) {
        if (s.getUsername().equals(text.getText())) {
            state = 1;
            if (s.getPassword().equals(pass.getText())) {
                state = 2;
                ID = DataBase.getUserID(text.getText());
                break;
            }
        }
    }

    if (state == 0) {
        for (PremiumStudent s : DataBase.getpStudent()) {
            if (s.getUsername().equals(text.getText())) {
                state = 1;
                if (s.getPassword().equals(pass.getText())) {
                    state = 2;
                    ID = DataBase.getUserID(text.getText());
                    break;
                }
            }
        }
    }
        if (state==0) {
            username_label.setText("Böyle bir kullanıcı bulunmamaktadır");
            pass_label.setText("");
            Alert s = new Alert(Alert.AlertType.ERROR);
            s.setTitle("could not sign");
            s.setContentText("No such user exists with this name");
            s.showAndWait();
        } else if (state==1) {
            System.out.println("kullanıcı adı doğru");
            pass_label.setText("yanlış şifre");
            username_label.setText("");
            Alert s = new Alert(Alert.AlertType.ERROR);
            s.setTitle("could not sign");
            s.setContentText("Wrong Password");
            s.showAndWait();
        } else if (state==2) {
            System.out.println("giriş başarılı");
            pass_label.setText("");
            username_label.setText("");
            Alert s = new Alert(Alert.AlertType.INFORMATION);
            s.setTitle("Login successful.");
            s.setContentText("Login was successful.");
            s.showAndWait();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("enterance.fxml"));
            root = (Parent) loader.load();
            Stage stage = (Stage) this.giris.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }

    }
}
