package ru.nsu.skopintsev.game.model.core;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Snake {
    private int playerId;
    private List<Coord> points;
    private SnakeState state;
    private Direction headDirection;
}
