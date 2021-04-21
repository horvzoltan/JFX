module JFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens sample to javafx.graphics, javafx.fxml;
}
