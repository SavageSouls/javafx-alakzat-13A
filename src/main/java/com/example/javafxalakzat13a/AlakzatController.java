package com.example.javafxalakzat13a;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AlakzatController {
    @FXML
    public ListView<String> listview_ListView;
    @FXML
    public ImageView imageview_Alakzat;
    @FXML
    public Pane pane_Alakzat;
    @FXML public RadioButton radioPiros;
    @FXML public RadioButton radioZold;
    @FXML public RadioButton radioKek;
    @FXML public RadioButton radioNegyzet;
    @FXML public RadioButton radioKor;
    @FXML public RadioButton radioHaromszog;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onPirosSelected(ActionEvent actionEvent) {
        System.out.println("onPirosSelected actionEvent" + actionEvent);

        pane_Alakzat.setBackground(new Background((new BackgroundFill(Color.RED, null, null))));
    }

    public void onKekSelected(ActionEvent actionEvent) {
        System.out.println("onKekSelected actionEvent" + actionEvent);

        pane_Alakzat.setBackground(new Background((new BackgroundFill(Color.BLUE, null, null))));
    }

    public void onZoldSelected(ActionEvent actionEvent) {
        System.out.println("onZoldSelected actionEvent" + actionEvent);

        pane_Alakzat.setBackground(new Background((new BackgroundFill(Color.GREEN, null, null))));
    }

    public void onNegyzetSelected(ActionEvent actionEvent) throws FileNotFoundException {
        imageview_Alakzat.setImage(new Image("file:icons/negyzet.png"));
    }

    public void onKorSelected(ActionEvent actionEvent) {
        imageview_Alakzat.setImage(new Image("file:icons/kor.png"));
    }

    public void onHaromszogSelected(ActionEvent actionEvent) {
        imageview_Alakzat.setImage(new Image("file:icons/haromszog.png"));
    }

    public void onHozzaadClick(ActionEvent actionEvent) {
        ObservableList<String> listviewLines = listview_ListView.getItems();

        String newline = "";

        if (radioPiros.isSelected()){
            newline += "Piros, ";
        }

        if (radioZold.isSelected()){
            newline += "Zöld, ";
        }
        if (radioKek.isSelected()){
            newline += "Kék, ";
        }

        if (radioNegyzet.isSelected()) newline+= "Négyzet";
        if (radioKor.isSelected()) newline+= "Kör";
        if (radioHaromszog.isSelected()) newline+= "Haromszög";

        //listviewLines.add("Piros, Kör");

        if (!newline.isEmpty()) listviewLines.add(newline);

        listview_ListView.setItems(listviewLines);
        listview_ListView.getSelectionModel().selectLast();
    }

    public void onTorolClick(ActionEvent actionEvent) {
        ObservableList<String> listviewLines = listview_ListView.getItems();
        ObservableList<Integer> selectedIndices = listview_ListView.getSelectionModel().getSelectedIndices();

        ObservableList<String> newListviewLines = FXCollections.observableArrayList();
        for (int i=0; i < listviewLines.size(); i++){
            if (!selectedIndices.contains(i)){
                newListviewLines.add(listviewLines.get(i));
            }
        }

        listview_ListView.setItems(newListviewLines);
        listview_ListView.getSelectionModel().selectLast();
    }
}