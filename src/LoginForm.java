import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.*;


public class LoginForm extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	private static final String Correct_Username = "sam";
	private static final String Correct_Password = "mypassword";
	private Label usernameLbl;
	private TextField usernameTf;
	private Label passwordLbl;
	private PasswordField passwordPf;
	private Button loginBtn;
	private Text resultTxt;

	@Override
	public void start(Stage stage) throws Exception {
		// Create the leaf nodes
		usernameLbl = new Label("Username:");
		usernameTf = new TextField();
		passwordLbl = new Label("Password:");
		passwordPf = new PasswordField();
		loginBtn = new Button("Login");
		resultTxt = new Text();

		loginBtn.setOnAction(event ->
				check()
		);

		GridPane grid = new GridPane();
		grid.add(usernameLbl, 0, 0);
		grid.add(usernameTf, 1, 0);

		grid.add(passwordLbl, 0, 1);
		grid.add(passwordPf, 1, 1);
		grid.add(loginBtn, 1, 2);
		grid.add(resultTxt, 1, 3);


		// Set the event handlers

		// Set the scene, show the stage
		Scene scene = new Scene(grid);
		stage.setScene(scene);
		stage.setTitle("LoginForm");
		stage.show();
	}

	private String getUsername() {
		return usernameTf.getText();
	}

	private String getPassword() {
		return passwordPf.getText();
	}

	private void check() {
		if (getUsername().equals(Correct_Username))
			resultTxt.setText("Password correct!");
		else
			resultTxt.setText("Password incorrect!");
	}
}