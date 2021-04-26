package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AfterLogin {

	@FXML
	private TableView<Product> table;
	@FXML
	private Button loadTable;
	@FXML
	private TableColumn<Product, Integer> col_id;
	@FXML
	private TableColumn<Product, String> col_productName;

	@FXML
	private TableColumn<Product, Integer> col_currentStock;

	@FXML
	private TableColumn<Product, Integer> col_price;

	@FXML
	private TextField searchTextField;
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

	ObservableList<Product> listM;

	public void logout(ActionEvent event) throws IOException {
		Main m = new Main();
		m.changeScene("Login.fxml");

	}
	
	public void loadData() {
		col_id.setCellValueFactory(new PropertyValueFactory<Product, Integer>("ID"));
		col_productName.setCellValueFactory(new PropertyValueFactory<Product, String>("productName"));
		col_price.setCellValueFactory(new PropertyValueFactory<Product, Integer>("productPrice"));
		col_currentStock.setCellValueFactory(new PropertyValueFactory<Product, Integer>("currentStock"));
		listM = InventoryDB.getDataProducts();
		table.setItems(listM);
	}

	public void openRegisterPage(ActionEvent event) throws IOException {
		Register reg = new Register();
		reg.open();
	}

	public void addItemToCart(ActionEvent event) throws IOException {

	}

	public void sellCurrentCart(ActionEvent event) throws IOException {

	}

}
