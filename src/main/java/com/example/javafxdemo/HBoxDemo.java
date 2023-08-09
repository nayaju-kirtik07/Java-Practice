package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxDemo extends Application {


    public static void main(String[] args) {
        launch();
    }


    @Override
    public void start(Stage stage) throws Exception {
        HBox hBox = new HBox();

        for (int i=0; i<=5; i++){
            Button button = new Button("Hello"+i);
            hBox.getChildren().add(button);
        }

        Scene scene = new Scene(hBox , 600 , 400);
        stage.setScene(scene);
        stage.show();
    }
}
