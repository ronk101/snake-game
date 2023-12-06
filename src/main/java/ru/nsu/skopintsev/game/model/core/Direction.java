package ru.nsu.skopintsev.game.model.core;

import lombok.Getter;

public enum Direction {
    UP(1),
    DOWN(2),
    LEFT(3),
    RIGHT(4);

    @Getter
    private final int value;

    Direction(int value) {
        this.value = value;
    }
    public static Direction valueOf(int value) {
        for (Direction direction : values()) {
            if (direction.value == value) {
                return direction;
            }
        }
        throw new IllegalArgumentException("Invalid Direction value: " + value);
    }
}
