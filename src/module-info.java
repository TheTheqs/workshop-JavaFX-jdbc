module JavaFX {
	requires javafx.fxml;
	requires javafx.controls;
	exports gui;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
}