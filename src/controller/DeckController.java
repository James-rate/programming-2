package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import model.Card;
import model.Deck;


public class DeckController extends Controller<Deck> {
    @FXML private ListView<Card> Decklv;
    @FXML Button ShowBtn;
    @FXML Button CloseButton;
    @FXML private void initialize() {
        Decklv.setItems(getDeck().getCards());
        ShowBtn.disableProperty().bind(Decklv.getSelectionModel().selectedItemProperty().isNull());
    }
    public Deck getDeck() {
        return model;
    }
    public Card getSelectedCard() {
        return Decklv.getSelectionModel().getSelectedItem();
    }

    @FXML public void ShowCard(ActionEvent event) {
        Card card = getSelectedCard();
        ViewLoader.showStage(card,"/view/CardView.fxml", card.getName(), new Stage());

    }
    @FXML void handleClose(ActionEvent event) {
        stage.close();
    }
}
