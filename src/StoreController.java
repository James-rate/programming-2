import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class StoreController {
    private Store store = new Store();
    public final Store getStore() {
        return store;
    }
    @FXML private Button sellBtn;
    @FXML private Text stockTXt;
    @FXML private Text priceTXt;
    @FXML private TextField amountTf;
    private void setAmount(int amount) {
        amountTf.setText("" + amount);
    }
    private int getAmount() {
        return Integer.parseInt(amountTf.getText());
    }
    public void handleStore(ActionEvent e){
        int amount = getAmount();
        if(getStore().getProduct().has(amount)){
            getStore().getProduct().sell(amount);
            setAmount(0);
        }

    }
    @FXML private Text cashTxt;
    @FXML
    private void initialize() {
        stockTXt.textProperty().bind(getStore().getProduct().stockProperty().asString().concat(" items"));
        priceTXt.textProperty().bind(getStore().getProduct().PriceProperty().asString("$%.2f"));
        cashTxt.textProperty().bind(getStore().getCashRegister().cashProperty().asString("$%.2f"));
    }
}
