package ru.nsu.skopintsev.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //FXMLLoader loader = new FXMLLoader(FXMLFile.MAIN.getUrl());
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/fxml/main.fxml");
        //loader.setLocation(FXMLFile.MAIN.getUrl());
        loader.setLocation(xmlUrl);
        Parent root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setTitle("Snake-game");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
