module JavaFX {
	requires javafx.fxml;
	requires javafx.controls;
	requires java.sql;
	exports gui;
	exports model.services;
	exports model.entities;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
}