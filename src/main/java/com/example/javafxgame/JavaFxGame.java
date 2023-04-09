package com.example.javafxgame;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;


public class JavaFxGame extends Application {

    public final int screenWidth = 600;
    public final int screenHeight = 600;

    @Override
    public void start(Stage stage)  {

        Canvas canvas = new Canvas(screenWidth, screenHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(16 + (2 / 3)), e -> run(gc))); // we use 16 + (2/3)

        tl.setCycleCount(Animation.INDEFINITE);
        canvas.setFocusTraversable(true);

        // handle mouse and key events
        canvas.setOnKeyPressed(e -> {

        });
        canvas.setOnKeyReleased(e -> {

        });
        canvas.setOnMouseClicked(e -> {

        });

        stage.setTitle("JavaFxGame");
        stage.setScene(new Scene(new StackPane(canvas)));
        stage.show();
        tl.play();
    }

    private void run(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRect(0,0,screenWidth,screenHeight);
        gc.setFill(Color.BLUE);
        gc.fillRect(300,300,25,25);
    }

    public static void main(String[] args) {
        launch();
    }
}