package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;


public class ErrorController extends Controller<Exception> {
    @FXML private Text errorType;
    @FXML private Button CloseBtn;
    public final Exception getException() {
        return model;
    }

    @FXML private void initialize() {
        errorType.setText(model.getClass().getSimpleName());
    }
    @FXML private void handleClose() {
    stage.close();
    }
}
