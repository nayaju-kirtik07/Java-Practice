package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        Button button1 = new Button("Hello1");
        Button button2 = new Button("Hello2");
        Button button3 = new Button("Hello3");
        Button button4 = new Button("Hello4");
        Button button5 = new Button("Hello5");

        gridPane.add(button1, 0,0,2,2);
        gridPane.add(button2, 2,2,1,1);
        gridPane.add(button3, 2,0,1,1);
        gridPane.add(button4, 3,1,1,1);
        gridPane.add(button5, 3,0,1,1);

//        gridPane.setHgap(2);
//        gridPane.setVgap(3);

        Scene scene = new Scene(gridPane , 600 , 400);
        stage.setScene(scene);
        stage.show();
    }
}
