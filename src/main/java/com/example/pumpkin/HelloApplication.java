package com.example.pumpkin;

import com.example.pumpkin.controller.HelloController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        HelloController controller = fxmlLoader.getController();
        stage.getScene().setOnKeyPressed(controller::keyPressed);
    }

    public static void main(String[] args) {
        launch();
    }
}
