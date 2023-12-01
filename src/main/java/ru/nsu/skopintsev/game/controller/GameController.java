package ru.nsu.skopintsev.game.controller;

import me.ippolitov.fit.snakes.SnakesProto.*;
import ru.nsu.skopintsev.game.model.GameModel;

import java.util.List;

public class GameController {
    private GameModel gameModel;

    public GameController(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public void updateGame() {
        updateSnakes();
        spawnFood();
    }

    private void updateSnakes() {
        List<GameState.Snake> snakes = gameModel.getGameState().getSnakesList();
        for (GameState.Snake snake : snakes) {
            // Логика обновления состояния каждой змеи
            // например, изменяем координаты головы и т.д.
        }
    }

    private void spawnFood() {
        List<GameState.Coord> food = gameModel.getGameState().getFoodsList();
        // Логика спавна еды
        // например, добавляем новую клетку еды в случайное место на поле
    }
}