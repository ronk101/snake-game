package ru.nsu.skopintsev.game.model.core;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class GameState {
    private int stateOrder;
    private List<Snake> snakes;
    private List<Coord> foods;
    private List<GamePlayer> players;
}
