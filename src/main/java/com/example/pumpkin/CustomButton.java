package com.example.pumpkin;


import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.awt.*;

public class CustomButton extends Button {

    public CustomButton() {
        this.setStyle(
                "-fx-shape: \"M23.6,0c-3.4,0-6.3,2.7-7.6,5.6C14.7,2.7,11.8,0,8.4,0C3.8,0,0,3.8,0,8.4c0,9.4,9.5,11.9,16,21.26.1-9.3,16-12.1,16-21.2C32,3.8,28.2,0,23.6,0z\";"
        );
        this.setPrefSize(200, 200);
    }

    @Override
    public void fire(){
        super.fire();
            Toolkit.getDefaultToolkit().beep();
        System.out.println("Button fired");

    }

}
