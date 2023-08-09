package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxDemo extends Application {

    public static void main(String[] args) {
        launch();
    }
    @Override


    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox();

        for (int i=1; i<=5; i++){
            Button button = new Button("Button" + i);
            vBox.getChildren().add(button);
        }


        Scene scene = new Scene(vBox, 600, 400);
        stage.setScene(scene);

        stage.show();
    }
}
