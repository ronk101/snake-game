package ru.nsu.skopintsev.game.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class StartMenu {

    @FXML
    private TextField nameInput;

    @FXML
    private void continueClicked(ActionEvent event) {
        String playerName = nameInput.getText();
        System.out.println("Player Name: " + playerName);

        // Add logic to proceed to the next screen or perform further actions
    }
}
