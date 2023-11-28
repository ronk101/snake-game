module ru.nsu.skopintsev.game {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens ru.nsu.skopintsev.game to javafx.fxml;
    exports ru.nsu.skopintsev.game;
}