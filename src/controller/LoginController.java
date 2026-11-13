package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.*;

import javax.swing.text.View;

//Note that this class is not complete!
//This will only add 2 players to the game.
public class LoginController extends Controller<LoginModel> {

    @FXML private TextField player1Tf;
    @FXML private ImageView player1;
    @FXML private TextField player2Tf;
    @FXML private ImageView player2;
    @FXML private TextField player3Tf;
    @FXML private ImageView player3;
    @FXML private TextField player4Tf;
    @FXML private ImageView player4;

    @FXML
    private void initialize() {
        player1Tf.setText("Davey");
        player2Tf.setText("Jenny");
        player1Tf.setEditable(false);
        player2Tf.setEditable(false);
        player3Tf.setEditable(true);
        player4Tf.setEditable(true);
        String imageUrl = "/view/image/avatar.png";
        player1.setImage(new Image(imageUrl));
        player2.setImage(new Image(imageUrl));
        player3.setImage(new Image(imageUrl));
        player4.setImage(new Image(imageUrl));

    }

    private LoginModel getLoginModel() {
        return model;
    }

    @FXML
    private void handleStart(ActionEvent event) {
        Player player1 = new Player(player1Tf.getText());
        Player player2 = new Player(player2Tf.getText());
        getLoginModel().addToGame(player1);
        getLoginModel().addToGame(player2);
        Player player3 = null;
        Player player4 = null;
        if (!player3Tf.getText().equals("")) {
            player3=new Player(player3Tf.getText());
            getLoginModel().addToGame(player3);
        }
        if (!player4Tf.getText().equals("")) {
            player4=new Player(player4Tf.getText());
            getLoginModel().addToGame(player4);
        }
        Dealer dealer=new Dealer(getLoginModel().getPlayers());
        ViewLoader.showStage(dealer, "/view/DealerView.fxml","Dealer",stage);
        ViewLoader.showStage(player1, "/view/PlayerView.fxml","Davey",new Stage());
        ViewLoader.showStage(player2, "/view/PlayerView.fxml","Jenny",new Stage());
        if (player3!=null){
            ViewLoader.showStage(player3, "/view/PlayerView.fxml",player3.getName(),new Stage());
        }
        if (player4!=null){
            ViewLoader.showStage(player4, "/view/PlayerView.fxml",player4.getName(),new Stage());
        }
    }
}
