package main.musica;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

public class reproductor {
    MediaView mediaView = new MediaView(null);


    public MediaView reproducir(String cancion){

        if(cancion == "fondoinicio"){
            String path = "musica/fondoinicio.mp3";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaView = new MediaView(mediaPlayer);
            return mediaView;
        }else if(cancion == "fondojuego"){
            String path = "/fondojuego.mp3";
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaView = new MediaView(mediaPlayer);
            return mediaView;
        }
        return null;
    }



}
