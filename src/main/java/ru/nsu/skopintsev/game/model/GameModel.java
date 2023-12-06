package ru.nsu.skopintsev.game.model;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import ru.nsu.skopintsev.game.model.core.*;

import java.util.List;

@Log4j2
public class GameModel {
    private final GameState gameState;
    private final GameConfig gameConfig;

    @Setter
    private Direction currentDirection;
    private GamePlayer gamePlayer;  // надо?
    private List<GamePlayer> gamePlayers; // надо?
    private NodeRole nodeRole; // надо?
    private PlayerType playerType; // надо?

    // TODO GameAnnouncement


    public GameModel(GameConfig gameConfig) {
        this.gameConfig = gameConfig;
        this.gameState = new GameState();
        initializeGame();
    }

    private void initializeGame() {
//        for (int playerId = 1; playerId <= gameConfig.getPlayers().size(); playerId++) {
//            Snake snake = new Snake(playerId, gameConfig.getInitialSnakeX(), gameConfig.getInitialSnakeY());
//            snakes.add(snake);
//        }

        // Спавним начальное количество еды
        spawnFood(gameConfig.getFoodStatic());
    }

    private void spawnFood(int foodCount) {
//        Random random = new Random();
//        for (int i = 0; i < foodCount; i++) {
//            int foodX = random.nextInt(gameConfig.getWidth());
//            int foodY = random.nextInt(gameConfig.getHeight());
//            //foods.add(new GameState.Coord(foodX, foodY));
//            gameState.setFoods(gameState.getFoods().add(new Coord(foodX, foodY)));
//        }
    }

    public void moveSnake(int playerID, Direction direction) {
        Snake snake = null;
        for (Snake snake1: gameState.getSnakes()) {
            if (snake1.getPlayerID() == playerID) {
                snake = snake1;
            }
            else {
                log.error("Такого игрока нет " + playerID);
                return;
            }
        }
        assert snake != null;
        Direction oldDirection = snake.getHeadDirection();
        switch (direction) {
            case UP -> snake.setHeadDirection(Direction.UP);
            case DOWN -> snake.setHeadDirection(Direction.DOWN);
            case LEFT -> snake.setHeadDirection(Direction.LEFT);
            case RIGHT -> snake.setHeadDirection(Direction.RIGHT);
        }

        Coord newHeadCoord = snake.getPoints().get(0);
        switch (snake.getHeadDirection()) {
            case UP -> {
                if (oldDirection == Direction.DOWN) {
                    newHeadCoord.setY(((newHeadCoord.getY() + 1) % gameConfig.getHeight()
                            + gameConfig.getHeight()) % gameConfig.getHeight());
                    snake.setHeadDirection(Direction.DOWN);
                }
                else {
                    newHeadCoord.setY(((newHeadCoord.getY() - 1) % gameConfig.getHeight()
                            + gameConfig.getHeight()) % gameConfig.getHeight());
                }
            }
            case DOWN -> {
                if (oldDirection == Direction.UP) {
                    newHeadCoord.setY(((newHeadCoord.getY() - 1) % gameConfig.getHeight()
                            + gameConfig.getHeight()) % gameConfig.getHeight());
                    snake.setHeadDirection(Direction.UP);
                }
                else {
                    newHeadCoord.setY(((newHeadCoord.getY() + 1) % gameConfig.getHeight()
                            + gameConfig.getHeight()) % gameConfig.getHeight());
                }
            }
            case LEFT -> {
                if (oldDirection == Direction.RIGHT) {
                    newHeadCoord.setX(((newHeadCoord.getY() + 1) % gameConfig.getWidth()
                            + gameConfig.getWidth()) % gameConfig.getWidth());
                    snake.setHeadDirection(Direction.RIGHT);
                }
                else {
                    newHeadCoord.setX(((newHeadCoord.getY() - 1) % gameConfig.getWidth()
                            + gameConfig.getWidth()) % gameConfig.getWidth());
                }
            }
            case RIGHT -> {
                if (oldDirection == Direction.LEFT) {
                    newHeadCoord.setX(((newHeadCoord.getY() - 1) % gameConfig.getWidth()
                            + gameConfig.getWidth()) % gameConfig.getWidth());
                    snake.setHeadDirection(Direction.RIGHT);
                }
                else {
                    newHeadCoord.setX(((newHeadCoord.getY() + 1) % gameConfig.getWidth()
                            + gameConfig.getWidth()) % gameConfig.getWidth());
                }
            }
        }

        moveHead(snake, newHeadCoord);
        moveTail(snake);
        // TODO сделать коллизию
    }

    private void moveTail(Snake snake) {
        //TODO сделать сдвиг хвоста
    }

    private void moveHead(Snake snake, Coord newHeadCoord) {
        // TODO Сделать сдвиг головы
    }
}
