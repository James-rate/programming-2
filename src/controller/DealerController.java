package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Card;
import model.Dealer;
import model.Player;
import model.exception.EmptyDeckException;
import model.exception.RoundNotReadyException;

public class DealerController extends Controller<Dealer> {
@FXML private Label Player1H;
@FXML private Label Player2H;
@FXML private Label Player3H;
@FXML private Label Player4H;
@FXML private Button CallBtn;
@FXML private Button DealerBtn;
@FXML private Button PlayroundBtn;
@FXML private Button CloseBtn;
@FXML private void initialize() {
    Player player1=model.getPlayers().get(0);
    Player player2=model.getPlayers().get(1);
    Player1H.textProperty().bind(player1.totalHealthProperty().asString());
    Player2H.textProperty().bind(player2.totalHealthProperty().asString());
    if(model.getPlayers().size()>2) {
        Player player3=model.getPlayers().get(2);
        Player3H.textProperty().bind(player3.totalHealthProperty().asString());
    }else {
        Player3H.setText("N/A");
    }
    if(model.getPlayers().size()>3) {
        Player player4=model.getPlayers().get(3);
        Player4H.textProperty().bind(player4.totalHealthProperty().asString());
    }else {
        Player4H.setText("N/A");
    }
}
@FXML private void handlecall(ActionEvent event) {
    Player winner=getWinner();
    ViewLoader.showStage(winner,"/view/PlayerWinView.fxml","Game Over",new Stage());

}
private Player getWinner() {
    Player winner=model.getPlayers().get(0);
    for (Player p : model.getPlayers()) {
        if (p.totalHealthProperty().get() > winner.totalHealthProperty().get()) {
            winner=p;
        }
    }
    return winner;
    }

    @FXML
    private void handleDeal(ActionEvent event) {
        try {
            model.deal();
        } catch (EmptyDeckException e) {
            ViewLoader.showStage(e,"/view/ErrorView.fxml","Error",new Stage());
        }
    }
@FXML private void handleplay(ActionEvent event) {
    try{
        model.play();
    }catch (RoundNotReadyException e){
        ViewLoader.showStage(e,"/view/ErrorView.fxml","Error",new Stage());
    }
}
@FXML private void handleClose(ActionEvent event) {
    Platform.exit();
}
@FXML private void openmaincard(MouseEvent event) {
ViewLoader.showStage(model.getMainDeck(),"/view/DeckView.fxml","Main Deck", new Stage());
}
@FXML private void opensecondcard(MouseEvent event) {
ViewLoader.showStage(model.getSecondaryDeck(),"/view/DeckView.fxml","Secondary Deck", new Stage());
}

}

