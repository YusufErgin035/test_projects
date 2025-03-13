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
import java.util.ArrayList;
import java.util.Objects;

public class login_controller {

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    TextField NewName;
    @FXML
    PasswordField NewPass;
    @FXML
    TextField Code;


    public void switchToSignPage(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("anasayfa.fxml")));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void signUp(ActionEvent e) throws IOException {
        String name=NewName.getText();
        String pass=NewPass.getText();
        ArrayList<Student> kullanici= DataBase.getStudent();
        ArrayList<PremiumStudent> pkullanici = DataBase.getpStudent();
        if(Code.getText().isEmpty()) {
            boolean state = true;
            for (Student k : kullanici) {
                if (name.equals(k.getUsername())) {
                    Alert state1 = new Alert(Alert.AlertType.ERROR);
                    state1.setTitle("could not sign up");
                    state1.setContentText("This user already exists");
                    state1.showAndWait();
                    state = false;
                }
            }
            if (state) {

                DataBase.addStudent(name, pass);
                Alert state1 = new Alert(Alert.AlertType.INFORMATION);
                state1.setTitle("Sign Up successful.");
                state1.setContentText("Succesfully added this user.");
                state1.showAndWait();
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("anasayfa.fxml")));
                stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            }
        }
        else if(Code.getText().equals("XXXX")) {
            boolean state = true;
            for (PremiumStudent k : pkullanici) {
                if (name.equals(k.getUsername())) {
                    Alert state1 = new Alert(Alert.AlertType.ERROR);
                    state1.setTitle("could not sign up");
                    state1.setContentText("This user already exists");
                    state1.showAndWait();
                    state = false;
                }
            }
            if (state) {
                DataBase.addpStudent(name, pass);
                Alert state1 = new Alert(Alert.AlertType.INFORMATION);
                state1.setTitle("Premium Sign Up successful.");
                state1.setContentText("Succesfully added this user.");
                state1.showAndWait();
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("anasayfa.fxml")));
                stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
        else{
            Alert state1 = new Alert(Alert.AlertType.ERROR);
            state1.setTitle("could not sign up to premium student");
            state1.setHeaderText("This user already exists");
            state1.setContentText("Please use the correct Code");
            state1.showAndWait();
        }
    }
}
