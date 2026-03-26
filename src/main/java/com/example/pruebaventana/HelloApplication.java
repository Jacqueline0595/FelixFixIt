package com.example.pruebaventana;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        Pane root = new Pane();
        root.setStyle(
                "-fx-background-image: url('Felix1.png');" +
                "-fx-background-size: cover;"
        );
        Scene scene = new Scene(root, 735, 824);
        stage.setTitle("Gato");
        stage.setScene(scene);
        stage.show();
        System.out.println("Hello World!"); // poniendo el ;
    }

    public static void main() {
        launch();
    }
}
