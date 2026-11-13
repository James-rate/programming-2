package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Card;

public class CardController extends Controller<Card> {
@FXML private ImageView cardView;
@FXML private Button CloseButton;
@FXML private void initialize() {
    String imageURl="/view/image/cards/"+getCard().getName().toLowerCase().replace(" ", "")+".png";
    cardView.setImage(new Image(imageURl));
}
public final Card getCard() {
    return model;
}
@FXML public void CloseCard(ActionEvent event) {
    stage.close();
}
}
