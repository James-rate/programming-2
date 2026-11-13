import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class Calculator extends Application {
    public static void main(String[] args) { launch(args); }

    private Label firstNumberLbl;
    private TextField firstNumberTf;
    private Label secondNumberLbl;
    private TextField secondNumberTf;
    private Label operationLbl;
    private Button addBtn;
    private Button subBtn;
    private Button mulBtn;
    private Button divBtn;
    private Label resultLbl;
    private TextField resultTf;

    @Override
    public void start(Stage stage) throws Exception {
        // 1. create the leaf nodes
        firstNumberLbl = new Label("First Number:");
        firstNumberTf = new TextField();
        secondNumberLbl = new Label("Second Number:");
        secondNumberTf = new TextField();
        operationLbl = new Label("Operation:");
        addBtn = new Button("+");
        subBtn = new Button("-");
        mulBtn = new Button("*");
        divBtn = new Button("/");
        resultLbl = new Label("Result:");
        resultTf = new TextField();

        // 2. create the branch node
        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(addBtn, subBtn, mulBtn, divBtn);

        GridPane grid = new GridPane();




        grid.add(firstNumberLbl, 0, 0);
        grid.add(firstNumberTf, 1, 0);

        grid.add(secondNumberLbl, 0, 1);
        grid.add(secondNumberTf, 1, 1);

        grid.add(operationLbl, 0, 2);
        grid.add(hbox, 1, 2);

        grid.add(resultLbl, 0, 3);
        grid.add(resultTf, 1, 3);

        addBtn.setOnAction(new EventHandler <ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int num1 = Integer.parseInt(firstNumberTf.getText());
                int num2 = Integer.parseInt(secondNumberTf.getText());
                int result = num1 + num2;
                resultTf.setText(String.valueOf(result));
            }
        });
        addBtn.setOnAction(new AddHandler());

        subBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int first = Integer.parseInt(firstNumberTf.getText());
                int second = Integer.parseInt(secondNumberTf.getText());
                int result = first - second;
                resultTf.setText(String.valueOf(result));
            }
        });

        mulBtn.setOnAction(event -> {
            int first =Integer.parseInt(firstNumberTf.getText());
            int second = Integer.parseInt(secondNumberTf.getText());
            int result = first * second;
            resultTf.setText(String.valueOf(result));
        });

        divBtn.setOnAction(event -> {
            int first = Integer.parseInt(firstNumberTf.getText());
            int second = Integer.parseInt(secondNumberTf.getText());
            int result = first / second;
            resultTf.setText(String.valueOf(result));
        });
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
    private int getFirstNumber() {
        return Integer.parseInt(firstNumberTf.getText());
    }
    private int getSecondNumber() {
        return Integer.parseInt(secondNumberTf.getText());
    }
    private void setResult(int value) {
        resultTf.setText(String.valueOf(value));

    }
    private class AddHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            int first = Integer.parseInt(firstNumberTf.getText());
            int second = Integer.parseInt(secondNumberTf.getText());
            int result = first + second;
            resultTf.setText(String.valueOf(result));
        }
    }

}
