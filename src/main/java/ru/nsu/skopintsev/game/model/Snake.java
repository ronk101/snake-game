package ru.nsu.skopintsev.game.model;

import javafx.scene.input.KeyCode;
import me.ippolitov.fit.snakes.SnakesProto;

import java.util.LinkedList;
import java.util.List;

public class Snake {
    private final int playerId;
    private final List<Coord> body;
    private final SnakesProto.Direction direction;
    private SnakesProto.GameState.Snake.SnakeState state;

    public Snake(int playerId, int initialX, int initialY) {
        this.playerId = playerId;
        this.body = new LinkedList<>();
        this.body.add(new Coord(initialX, initialY));
        this.direction = SnakesProto.Direction.RIGHT; // Например, начнем движение вправо
        this.state = SnakesProto.GameState.Snake.SnakeState.ALIVE;
    }

    public int getPlayerId() {
        return playerId;
    }

    public List<Coord> getBody() {
        return body;
    }

    public SnakesProto.Direction getDirection() {
        return direction;
    }

    public SnakesProto.GameState.Snake.SnakeState getState() {
        return state;
    }

    public void setDirection(KeyCode input) {
        // Реализуйте логику изменения направления змейки в зависимости от ввода
        // Например, при нажатии клавиши вверх, установите direction = Direction.UP
    }

    public void move() {
        // Реализуйте логику движения змейки в текущем направлении
        // Например, добавьте новую голову в нужном направлении, удалите хвост
    }

    public void setState(SnakesProto.GameState.Snake.SnakeState state) {
        this.state = state;
    }

    public boolean checkCollisionWithSelf() {
        // Реализуйте логику проверки столкновения змейки с самой собой
        return false;
    }

    public boolean checkCollisionWithOtherSnake(Snake otherSnake) {
        // Реализуйте логику проверки столкновения змейки с другой змейкой
        return false;
    }

    // Другие методы, которые могут понадобиться для обработки игровой логики
}
