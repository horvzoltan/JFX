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
	private TableView<String> table;
	@FXML
	private Button logoutButton;
	@FXML
	private Button addItemToCartButton;
	@FXML
	private Button openInventoryButton;
	@FXML
	private Button sellButton;

	public void logout(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("Login.fxml");

	}

	public void addItemToCart(ActionEvent event) throws IOException {

	}

	public void sellCurrentCart(ActionEvent event) throws IOException {

	}

}
