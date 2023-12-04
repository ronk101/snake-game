package ru.nsu.skopintsev.game.model;

import me.ippolitov.fit.snakes.SnakesProto.GameConfig;
import me.ippolitov.fit.snakes.SnakesProto.GamePlayers;
import me.ippolitov.fit.snakes.SnakesProto.GameState;

public class GameModel {
    private GameState gameState;
    private GamePlayers gamePlayers;
    private GameConfig gameConfig;


    public GameModel(int width, int height, int food_static, int state_delay_ms) {
        initGameConfig(width, height, food_static, state_delay_ms);
    }

    private void initGameConfig(int width, int height, int food_static, int state_delay_ms) {
        gameConfig = GameConfig.newBuilder()
                .setWidth(width)
                .setHeight(height)
                .setFoodStatic(food_static)
                .setStateDelayMs(state_delay_ms)
                .build();
    }

    public GameState getGameState() {
        return gameState;
    }

    public GamePlayers getGamePlayers() {
        return gamePlayers;
    }

    public GameConfig getGameConfig() {
        return gameConfig;
    }
}
