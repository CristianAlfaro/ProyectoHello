package main.proyectiles;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class Laser {
    public ImageView crearLaser(ImageView player, AnchorPane tablero) {
        Image laser = new Image(getClass().getResourceAsStream("../images/laser1.png"));
        ImageView lase = new ImageView(laser);
        lase.setImage(laser);
        lase.setFitWidth(50);
        lase.setFitHeight(50);
        lase.setX(player.getX());
        lase.setY(player.getY());
        tablero.getChildren().add(lase);
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(2), new KeyValue(lase.imageProperty(), laser)),
                new KeyFrame(Duration.seconds(3), new KeyValue(lase.imageProperty(), null))
        );
        timeline.play();

        return lase;

        public void destruirlaser(ImageView laser,AnchorPane tablero){

        }

    }
