package ru.nsu.skopintsev.game.model;

import me.ippolitov.fit.snakes.SnakesProto;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    private int stateOrder;
    private List<Snake> snakes;
    private List<Coord> foods;
    private SnakesProto.GamePlayers players;

    public GameState(int stateOrder, SnakesProto.GamePlayers players) {
        this.stateOrder = stateOrder;
        this.snakes = new ArrayList<>();
        this.foods = new ArrayList<>();
        this.players = players;
    }

    public int getStateOrder() {
        return stateOrder;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public List<Coord> getFoods() {
        return foods;
    }

    public SnakesProto.GamePlayers getPlayers() {
        return players;
    }

    public void addSnake(Snake snake) {
        snakes.add(snake);
    }

    public void removeSnake(int playerId) {
        // Реализуйте логику удаления змейки по идентификатору игрока
        // Например, используйте итератор для поиска и удаления змейки
    }

    public void moveSnakes() {
        // Реализуйте логику для выполнения хода для каждой змейки
        // Например, вызовите move() для каждой змейки
    }

    public void checkCollisions() {
        // Реализуйте логику проверки столкновений для каждой змейки
        // Например, вызовите checkCollisionWithSelf() и checkCollisionWithOtherSnake() для каждой змейки
        // Удаляйте змейки, которые столкнулись сами с собой или друг другом
    }

    public void updateGameState() {
        moveSnakes();
        checkCollisions();
        // Дополнительная логика обновления игрового состояния
        // Например, обработка поедания еды, добавление новых единиц еды, подсчет очков
    }
}
