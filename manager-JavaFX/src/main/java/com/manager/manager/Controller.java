package com.manager.manager;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public ImageView Exit;

    @FXML
    private Label Menu;

    @FXML
    private Label MenuClose;

    @FXML
    private AnchorPane slider;

    //------------------
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Exit.setOnMouseClicked(event -> {
            System.exit(0);
        });

        //------------------ Open Menu
        slider.setTranslateX(-176);
        Menu.setOnMouseClicked(event -> {
                TranslateTransition slide = new TranslateTransition();
                slide.setDuration(Duration.seconds(0.4));
                slide.setNode(slider);

                slide.setToX(0);
                slide.play();

                slider.setTranslateX(-176);

                slide.setOnFinished ((ActionEvent e)-> {
                    Menu.setVisible(false);
                    MenuClose.setVisible(true);
                });
        });
        //------------------Close Menu
        MenuClose.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished ((ActionEvent e)-> {
                Menu.setVisible(true);
                MenuClose.setVisible(false);
            });
        });
    }
}
