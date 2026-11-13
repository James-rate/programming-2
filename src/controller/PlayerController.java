package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Card;
import model.Player;


public class PlayerController extends Controller<Player> {
@FXML private TableView<Card> handTv;
@FXML private ListView<Card> temphandLv;
@FXML private TableColumn<Card,String> attackClm;
@FXML private TableColumn<Card,String> styleClm;
@FXML private TableColumn<Card,String> healthClm;
@FXML private Button selectBtn;
@FXML private Button placeBtn;
@FXML private ImageView playerCardView;
public Player getPlayer() {
    return model;
}
@FXML private void initialize() {
temphandLv.setItems(getPlayer().getTempHand());
handTv.setItems(getPlayer().getHand());
    selectBtn.disableProperty().bind(handTv.getSelectionModel().selectedItemProperty().isNull());
    placeBtn.disableProperty().bind(temphandLv.getSelectionModel().selectedItemProperty().isNull());
    attackClm.setCellValueFactory(cellData -> cellData.getValue().attackProperty().asString());
    styleClm.setCellValueFactory(cellData -> cellData.getValue().styleProperty());
    healthClm.setCellValueFactory(cellData -> cellData.getValue().healthProperty().asString());

    model.selectedCardProperty().addListener((observable, oldValue, newValue) -> {
        String imageUrl;
        if (newValue == null) {
            imageUrl="/view/image/cards/empty.png";
        }else {
            imageUrl="/view/image/cards/"+newValue.getName().toLowerCase().replace(" ", "")+ ".png";
        }
        Image image = new Image(getClass().getResource(imageUrl).toExternalForm());
        playerCardView.setImage(image);
    });
}

@FXML private void handleselect(ActionEvent event) {
    Card card =handTv.getSelectionModel().getSelectedItem();
    getPlayer().select(card);
}

@FXML private void handleplace (ActionEvent event) {
    Card card = temphandLv.getSelectionModel().getSelectedItem();
    try{
        getPlayer().place(card);
    }catch(Exception e){
        ViewLoader.showStage(e,"/view/ErrorView.fxml", card.getName(), new Stage());
    }

}
}
