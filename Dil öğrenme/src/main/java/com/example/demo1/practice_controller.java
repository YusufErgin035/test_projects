package com.example.demo1;

import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.geometry.Bounds;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.VBox;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;


public class practice_controller {
    Random rand = new Random();
    int true_counter = 0;
    int false_counter = 0;
    private double xAxis;
    private double yAxis;
    word TrueWord;
    word FalseWord;
    boolean isFirst=true;
    boolean state;
    ArrayList<word> myList ;
    @FXML
    VBox vBox1;
    @FXML
    Label WordCount;
    @FXML
    Label Word;
    @FXML
    Rectangle RecTrue;
    @FXML
    Rectangle RecFalse;
    @FXML
    Label lbl1;
    @FXML
    Label lbl2;
    @FXML
    Button true_field;
    @FXML
    Button false_field;
    boolean getRandom(){
        boolean i =rand.nextBoolean();

        if(myList.size()<2){
            setReset();
            return i;

        }
        else{
            int randint=rand.nextInt(myList.size());
            TrueWord = myList.get(randint);
            myList.remove(TrueWord);
            System.out.println(myList.size());
            System.out.println(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size());

            do{
                FalseWord = myList.get(rand.nextInt(myList.size()));
            }while (TrueWord.getTurkish().equals(FalseWord.getTurkish()));
            WordCount.setText(TrueWord.getEnglish());
            Word.setText(TrueWord.getIpa());
            System.out.println("i="+i);
            if(i) {
                lbl1.setText(TrueWord.getTurkish());
                lbl2.setText(FalseWord.getTurkish());
            }else {
                lbl1.setText(FalseWord.getTurkish());
                lbl2.setText(TrueWord.getTurkish());
            }
        }

        return i;
    }

    public void initialize() {
        if(isFirst){
            System.out.println("top:"+DataBase.getStudent(HelloController.getSavedID()).get_mylist().size());
            myList = new ArrayList<>(DataBase.getStudent(HelloController.getSavedID()).get_mylist());
            System.out.println(DataBase.getStudent(HelloController.getSavedID()).get_mylist().size());
            state = getRandom();
            isFirst=false;
        }
        vBox1.setOnMousePressed(e -> {
            xAxis=e.getSceneX() - vBox1.getLayoutX();
            yAxis=e.getSceneY() - vBox1.getLayoutY();
        });
        vBox1.setOnMouseDragged(e -> {
            vBox1.setLayoutX(e.getSceneX() - xAxis);
            vBox1.setLayoutY(e.getSceneY() - yAxis);
            Bounds boxBounds = vBox1.getBoundsInParent();
            Bounds TrueTargetBounds = RecTrue.getBoundsInParent();
            Bounds FalseTargetBounds = RecFalse.getBoundsInParent();

            if(boxBounds.intersects(TrueTargetBounds)) {
                RecTrue.setOpacity(10);
            }
            else if(boxBounds.intersects(FalseTargetBounds)) {
                RecFalse.setOpacity(10);
            }
            else{
                RecTrue.setOpacity(0);
                RecFalse.setOpacity(0);

            }
        });
        vBox1.setOnMouseReleased(e -> {

            Bounds boxBounds = vBox1.getBoundsInParent();
            Bounds TrueTargetBounds = RecTrue.getBoundsInParent();
            Bounds FalseTargetBounds = RecFalse.getBoundsInParent();

            if (boxBounds.intersects(TrueTargetBounds)) {
                if(state){
                    System.out.println("correct1");
                    DataBase.getStudent(HelloController.getSavedID()).get_myWord(TrueWord).addToPoint();
                    true_counter++;
                    state=getRandom();
                }
                else{
                    System.out.println("false1");
                    false_counter++;
                    DataBase.getStudent(HelloController.getSavedID()).get_myWord(TrueWord).decreasePoint();
                    state=getRandom();
                }
                vBox1.setLayoutX(215);
                vBox1.setLayoutY(130);
            }
            else if(boxBounds.intersects(FalseTargetBounds)) {

                if(state){
                    System.out.println("false2");
                    false_counter++;
                    DataBase.getStudent(HelloController.getSavedID()).get_myWord(TrueWord).decreasePoint();
                    state=getRandom();
                } else{
                    System.out.println("correct2");
                    DataBase.getStudent(HelloController.getSavedID()).get_myWord(TrueWord).addToPoint();
                    true_counter++;
                    state=getRandom();
                }
                vBox1.setLayoutX(215);
                vBox1.setLayoutY(130);
            }
            else{
                vBox1.setLayoutX(215);
                vBox1.setLayoutY(130);
            }
            true_field.setText(String.valueOf(true_counter));
            false_field.setText(String.valueOf(false_counter));
        });
    }
    public void setReset(){
        Alert state1 = new Alert(Alert.AlertType.INFORMATION);
        state1.setTitle("Practice ended");
        state1.setHeaderText("Your Score:");
        state1.setContentText("True: "+true_counter+"pts\nFalse: "+false_counter+"pts");
        vBox1.setLayoutX(215);
        vBox1.setLayoutY(130);
        state1.showAndWait();
        setRestart();
    }
    public void setRestart() {
        isFirst=true;
        true_counter=0;
        true_field.setText(String.valueOf(true_counter));
        System.out.println(myList.size());
        false_counter=0;
        false_field.setText(String.valueOf(false_counter));
        initialize();
        vBox1.setLayoutX(215);
        vBox1.setLayoutY(130);
    }
    public void switchToEnterancePage(ActionEvent e) throws IOException {
        int Id = HelloController.getSavedID();
        for(word w:DataBase.getStudent(Id).get_mylist()){
            if(w.getPoint()>=5){
                DataBase.getStudent(Id).getVe_learned().add(w);
            }
        }
        for(word w:DataBase.getStudent(Id).getVe_learned()){
            if(w.getPoint()>=5) {
                DataBase.getStudent(Id).get_mylist().remove(w);
            }
        }
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("enterance.fxml")));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}










