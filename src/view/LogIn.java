package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogIn {

	public LogIn() {

	}

	@FXML
	private Button button;
	@FXML
	private Label wrongLogIn;
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;

	public void userLogin(ActionEvent event) throws IOException {
		String sqlSelectAllUsers = "SELECT * FROM USERS";
		String connectionUrl = "jdbc:mysql://localhost:3306/inventory?serverTimezone=UTC";
		try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "almarepa2");
				PreparedStatement ps = conn.prepareStatement(sqlSelectAllUsers);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				String usernameFromDb = rs.getString("USERNAME");
				String passwordFromDb = rs.getString("PASSWORD");
				if (username.getText().toString().equals(usernameFromDb)) {
					checkLogin(usernameFromDb, passwordFromDb);
				}

			}
			wrongLogIn.setText("Wrong username or password!");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void checkLogin(String usernameFromDb, String passwordFromDb) throws IOException {
		Main m = new Main();
		if (username.getText().toString().equals(usernameFromDb)
				&& password.getText().toString().equals(passwordFromDb)) {
			wrongLogIn.setText("Success!");

			m.changeScene("AfterLogin.fxml");
		}

		else if (username.getText().isEmpty() && password.getText().isEmpty()) {
			wrongLogIn.setText("Please enter your data.");
		}

		else {
			wrongLogIn.setText("Wrong username or password!");
		}
	}
}
