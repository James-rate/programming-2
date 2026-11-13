package controller;

import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.beans.property.*;
import java.io.*;
import java.text.*;
import au.edu.uts.ap.javafx.*;
import model.*;

public class StoreController extends Controller<Store> {
    public final Store getStore() {
        return model;
    }
    @FXML private Text cashTxt;
    @FXML
    private void initialize() {
        cashTxt.textProperty().bind(getStore().getCashRegister().cashProperty().asString("$%.2f"));
    }
    @FXML private ListView<Product> productlv;
    private  Product getSelectedProduct(){
        return productlv.getSelectionModel().getSelectedItem();
    }
    public void openProduct(ActionEvent event)throws IOException {
        Product product=getSelectedProduct();
        ViewLoader.showStage(product,"/view/product.fxml", product.getName()+" seat product", new Stage());
    }
}
