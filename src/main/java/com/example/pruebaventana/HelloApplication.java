package com.example.pruebaventana;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private static final int PASO = 10;

    @Override
    public void start(Stage stage){

        Image image = new Image("/Felix/Felix1.png", 15, 33, false, false);
        ImageView imageView = new ImageView(image);

        Image img = new Image("/Fondo/BackgroundInitial.png", 240, 255, false, false);
        ImageView fondo = new ImageView(img);

        imageView.setScaleX(2);
        imageView.setScaleY(2);

        fondo.setScaleX(2);
        fondo.setScaleY(2);

        Pane root = new Pane();

        root.getChildren().add(fondo);
        root.getChildren().add(imageView);

        Scene scene = new Scene(root, 240, 255);

        scene.setCamera(null);

        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case W: imageView.setLayoutY(imageView.getLayoutY() - PASO); break;
                case S: imageView.setLayoutY(imageView.getLayoutY() + PASO); break;
                case A: imageView.setLayoutX(imageView.getLayoutX() - PASO); break;
                case D: imageView.setLayoutX(imageView.getLayoutX() + PASO); break;
                default: break;
            }
        });

        stage.setTitle("Felix FixIt");
        stage.setScene(scene);
        stage.show();

        imageView.setFocusTraversable(true);
        imageView.requestFocus();
    }
}
