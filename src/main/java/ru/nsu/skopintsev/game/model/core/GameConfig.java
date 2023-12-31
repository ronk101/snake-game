package ru.nsu.skopintsev.game.model.core;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class GameConfig {
    private int width = 40;
    private int height = 30;
    private int foodStatic = 1;
    private int stateDelayMs = 1000;
}
