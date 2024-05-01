module JavaFX {
	requires javafx.fxml;
	requires javafx.controls;
	requires java.sql;
	requires transitive javafx.base;
	exports gui;
	exports model.services;
	exports model.entities;
	exports gui.listener;
	exports model.exceptions;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
}