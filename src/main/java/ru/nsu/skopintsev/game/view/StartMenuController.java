package ru.nsu.skopintsev.game.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class StartMenuController {
    @FXML
    private TextField nicknameInput;

    @FXML
    private ListView<String> roomsList;

    @FXML
    private void createRoom(ActionEvent event) {
        if (isNicknameValid()) {
            //System.out.println("Creating room...");
            log.info("Creating room...");
        } else {
            //System.out.println("Enter your nickname!");
            log.info("Enter your nickname!");
        }
    }

    @FXML
    private void joinRoom(ActionEvent event) {
        if (isNicknameValid()) {
            //System.out.println("Joining room...");
            log.info("Joining room...");
        } else {
            //System.out.println("Enter your nickname!");
            log.info("Enter your nickname!");
        }
    }

    private boolean isNicknameValid() {
        String nickname = nicknameInput.getText().trim();
        return !nickname.isEmpty();
    }

    private void showNicknameError() {
        Alert alert = new Alert(Alert.AlertType.ERROR, "Please enter a valid nickname.", ButtonType.OK);
        alert.showAndWait();
    }
}
