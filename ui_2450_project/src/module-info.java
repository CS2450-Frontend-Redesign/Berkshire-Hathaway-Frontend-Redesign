 module ui_2450_project {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;

	
	opens application to javafx.graphics, javafx.fxml;
}
