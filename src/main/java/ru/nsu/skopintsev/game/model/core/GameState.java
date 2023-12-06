package ru.nsu.skopintsev.game.model.core;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GameState {
    private int stateOrder;
    private List<Snake> snakes;
    private List<Coord> foods;
    private List<GamePlayer> players;
}
