package view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManageInventory {

	@FXML
	private TextField productName;

	@FXML
	private TextField price;

	@FXML
	private TextField qty;

	@FXML
	private Button addButton;

	public void open() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ManageInventory.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Manage Inventory");
			stage.setScene(new Scene(root1));
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addItem(ActionEvent e) throws IOException, InterruptedException {
		InventoryDB.addProduct(productName.getText(), Integer.parseInt(price.getText()),
				Integer.parseInt(qty.getText()));
		Thread.sleep(1000);
		Stage stage = (Stage) productName.getScene().getWindow();
		stage.close();
	}
}
