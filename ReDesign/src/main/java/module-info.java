module main.redesign {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens main.redesign to javafx.fxml;
    exports main.redesign;
}