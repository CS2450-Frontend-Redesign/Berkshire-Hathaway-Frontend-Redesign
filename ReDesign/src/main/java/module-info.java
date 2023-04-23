module com.example.redesign {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.redesign to javafx.fxml;
    exports com.example.redesign;
}