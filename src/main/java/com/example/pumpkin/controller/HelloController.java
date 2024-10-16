package com.example.pumpkin.controller;

import com.example.pumpkin.Pumpkin;
import com.example.pumpkin.model.Model;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;



import static com.example.pumpkin.Pumpkin.*;

public class HelloController {
    //This method will run after the controller object is created
    //and the fields are initialized.
    public void initialize() {
        startRandomEvent();
    }


    private void startRandomEvent(){
            Timeline timeline = new Timeline(
                    new KeyFrame(
                            Duration.millis(Math.random()*3000),
                            (ActionEvent event) ->{
                                model.randomlyChangeOnePumpkin();
                                HelloController.this.startRandomEvent();
                            }
                    )
            );
            timeline.play();
    }

    private Model model = new Model();

    public Model getModel() {
        return model;
    }

    public void image1Clicked(MouseEvent mouseEvent) {
        model.pumpkinSmashed(FIRST);
    }
    public void image2Clicked(MouseEvent mouseEvent) {
        model.pumpkinSmashed(SECOND);
    }
    public void image3Clicked(MouseEvent mouseEvent) {
        model.pumpkinSmashed(THIRD);
    }
}
