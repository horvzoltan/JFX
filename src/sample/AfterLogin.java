package sample;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AfterLogin {
	@FXML
	private TextField searchTextField;
	@FXML
	private ScrollPane scrollPane;
	@FXML
	private TableView<String> table;
	@FXML
	private Button logout;
	
	
	
	
	
	public void logout(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("Login.fxml");

	}
	
	
	
	
}
