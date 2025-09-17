package com.example.javafxalakzat13a;

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
    public RadioButton onKekSelected;

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
}