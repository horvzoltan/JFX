package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class InventoryDB {
	private static final String connectionUrl = "jdbc:mysql://localhost:3306/inventory?serverTimezone=UTC";

	public InventoryDB() {
		
	}

	public static ObservableList<Product> getDataProducts() {

		String selectAllFromProducts = "SELECT * FROM PRODUCTS";
		ObservableList<Product> list = FXCollections.observableArrayList();
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "almarepa2");
				PreparedStatement ps = conn.prepareStatement(selectAllFromProducts);) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Product(Integer.parseInt(rs.getString("ID")), rs.getString("PRODUCT_NAME"),
						Integer.parseInt(rs.getString("PRODUCT_PRICE")),
						Integer.parseInt(rs.getString("PRODUCT_STOCK"))));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
