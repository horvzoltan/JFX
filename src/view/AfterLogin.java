package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
	@FXML
	private Button openRegisterPageButton;

	public void logout(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("Login.fxml");

	}

	public void openRegisterPage(ActionEvent event) throws IOException {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Register.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Register");
			stage.setScene(new Scene(root1));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addItemToCart(ActionEvent event) throws IOException {

	}

	public void sellCurrentCart(ActionEvent event) throws IOException {

	}

}
