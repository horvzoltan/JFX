package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Register {

	class Validator {
		public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{6,19}$";
	}

	public Register() {
	}

	@FXML
	private Button registerButton;
	@FXML
	private PasswordField passwordToRegister;
	@FXML
	private TextField usernameToRegister;
	@FXML
	private Label wrongLogin;

	public void registerNewUser() {
		if (usernameToRegister.getText().matches(Validator.regularExpression)
				&& passwordToRegister.getText().matches(Validator.regularExpression)) {

			String userToRegister = "INSERT INTO USERS (USERNAME,PASSWORD)" + " VALUES (?, ?)";
			String connectionUrl = "jdbc:mysql://localhost:3306/inventory?serverTimezone=UTC";
			try (Connection conn = DriverManager.getConnection(connectionUrl, "root", "almarepa2");
					PreparedStatement ps = conn.prepareStatement(userToRegister);) {
				ps.setString(1, usernameToRegister.getText());
				ps.setString(2, passwordToRegister.getText());
				ps.execute();
				wrongLogin.setText("Successfully registered");
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} else {
			wrongLogin.setText("Invalid Username or password");
		}
	}

}
