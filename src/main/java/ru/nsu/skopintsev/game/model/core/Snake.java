package ru.nsu.skopintsev.game.model.core;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class Snake {
    private int playerID;
    private List<Coord> points;
    private SnakeState state;
    private Direction headDirection;
}
