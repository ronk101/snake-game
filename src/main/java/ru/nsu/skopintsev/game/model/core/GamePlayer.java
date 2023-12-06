package ru.nsu.skopintsev.game.model.core;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GamePlayer {
    private String name;
    private int id;
    private String ipAddress;
    private int port;
    private NodeRole role;
    private PlayerType type;
    private int score;

    public GamePlayer(String name, int id, String ipAddress, int port, NodeRole role, PlayerType type, int score) {
        this.name = name;
        this.id = id;
        this.ipAddress = ipAddress;
        this.port = port;
        this.role = role;
        this.type = type;
        this.score = score;
    }
}
