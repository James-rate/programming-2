package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Player;

public class PlayerWinController extends Controller<Player> {
@FXML private Label winner;
@FXML private Label Health;
@FXML private void initialize() {
    winner.setText(model.getName()+ " Wins!");
    Health.setText("Total Health: "+model.totalHealthProperty().getValue());

}
@FXML private void handleClose(ActionEvent event) {
    stage.close();
    }
}
