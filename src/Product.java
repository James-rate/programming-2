import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;

import java.util.LinkedList;

public class Product {
    private LinkedList<ProductObserver> observers = new LinkedList<ProductObserver>();
    private String name;
    private IntegerProperty stock = new SimpleIntegerProperty();
    private DoubleProperty price = new SimpleDoubleProperty();
    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock.set(stock);
        this.price.set(price);
    }


    public final String getName() {return name;}
    public final int getStock() {return stock.get();}
    public ReadOnlyIntegerProperty stockProperty() {
        return stock;
    }
    public final DoubleProperty PriceProperty() {
        return price;
    }
    public final double getPrice() {return price.get();}
    public void sell(int n) {
        stock.set(stock.get() - n);
        double money = n * price.get();
        for (ProductObserver observer : observers)
            observer.handleSale(money);
    }
    public void restock(int n) {
        stock.set(stock.get() + n);
    }
    public boolean has(int n) {
        return stock.get() >= n;
    }
    public void addProductObserver(ProductObserver observer) {
        observers.add(observer);
    }
    @Override
    public String toString() {
        return stock + " " + name + " at $" + price;
    }
}
