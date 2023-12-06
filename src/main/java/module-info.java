module ru.nsu.skopintsev.game {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires protobuf.java;
    requires lombok;
    requires org.apache.logging.log4j;

    exports ru.nsu.skopintsev.game;
    opens ru.nsu.skopintsev.game to javafx.fxml;
    exports ru.nsu.skopintsev.game.view;
    opens ru.nsu.skopintsev.game.view to javafx.fxml;
}