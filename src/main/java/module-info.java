module ru.nsu.skopintsev.game {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    exports ru.nsu.skopintsev.game.view;
    opens ru.nsu.skopintsev.game.view to javafx.fxml;
}