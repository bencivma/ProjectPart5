package com.example.javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.*;

public class Part5Calculator extends Application {
    private float operand1 = 0;
    private String op = null;
    private float operand2 = 0;
    private  int length = 0;
    private boolean solved = false;
    private boolean operator = false;

@Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(350, 400);
        pane.setVgap(5);
        pane.setHgap(5);

        TextField screen = new TextField();
        screen.setText("0");
        pane.add(screen, 22, 0);

        Button num1 = new Button("1");
        pane.add(num1, 10, 5);
    num1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("1"); }
            else { screen.setText(screen.getText() + "1"); }
        }
    });

        Button num2 = new Button("2");
        pane.add(num2, 22, 5);
    num2.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("2"); }
            else { screen.setText(screen.getText() + "2"); }
        }
    });

        Button num3 = new Button("3");
        pane.add(num3, 10, 10);
    num3.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("3"); }
            else { screen.setText(screen.getText() + "3"); }
        }
    });

        Button num4 = new Button("4");
        pane.add(num4, 22, 10);
    num4.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("4"); }
            else { screen.setText(screen.getText() + "4"); }
        }
    });

        Button num5 = new Button("5");
        pane.add(num5, 10, 15);
    num5.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("5"); }
            else { screen.setText(screen.getText() + "5"); }
        }
    });

        Button num6 = new Button("6");
        pane.add(num6, 22, 15);
    num6.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("6"); }
            else { screen.setText(screen.getText() + "6"); }
        }
    });

        Button num7 = new Button("7");
        pane.add(num7, 10, 20);
    num7.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("7"); }
            else { screen.setText(screen.getText() + "7"); }
        }
    });

        Button num8 = new Button("8");
        pane.add(num8, 22, 20);
    num8.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("8"); }
            else { screen.setText(screen.getText() + "8"); }
        }
    });

        Button num9 = new Button("9");
        pane.add(num9, 10, 25);
    num9.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("9"); }
            else { screen.setText(screen.getText() + "9"); }
        }
    });

        Button num0 = new Button("0");
        pane.add(num0, 22, 25);
    num0.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent arg0) {
            if (solved) {
                screen.setText("0");
                solved = false;
            }
            if (screen.getText().equals("0")) { screen.setText("0"); }
            else { screen.setText(screen.getText() + "0"); }
        }
    });






    Button plus = new Button("+");
    pane.add(plus, 24, 5);
    plus.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (!solved){
                if (!operator){
                    operator = true;
                    operand1 = Float.parseFloat(screen.getText());
                    op = "+";
                    screen.setText(screen.getText() + op);
                    length = screen.getLength();
                }
            }
        }
    });

    Button minus = new Button("-");
    pane.add(minus, 24, 10);
    minus.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (!solved){
                if (!operator){
                    operator = true;
                    operand1 = Float.parseFloat(screen.getText());
                    op = "-";
                    screen.setText(screen.getText() + op);
                    length = screen.getLength();
                }
            }
        }
    });

    Button divide = new Button("÷");
    pane.add(divide, 24, 15);
    divide.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (!solved){
                if (!operator){
                    operator = true;
                    operand1 = Float.parseFloat(screen.getText());
                    op = "÷";
                    screen.setText(screen.getText() + op);
                    length = screen.getLength();
                }
            }
        }
    });

    Button times = new Button("×");
    pane.add(times, 24, 20);
    times.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (!solved){
                if (!operator){
                    operator = true;
                    operand1 = Float.parseFloat(screen.getText());
                    op = "×";
                    screen.setText(screen.getText() + op);
                    length = screen.getLength();
                }
            }
        }
    });

    Button equals = new Button("=");
    pane.add(equals, 24, 25);
    equals.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            if (screen.getLength() != length){
                if (operator){
                    operator = false;
                    operand2 = Float.parseFloat(screen.getText().substring(length));
                    screen.setText(calc(operand1, operand2, op));
                    solved = true;
                }
            }
        }
    });

        pane.setStyle("-fx-background-color: #0ED0D2;");
        Scene scene = new Scene(pane, 400, 550);
        primaryStage.setTitle("Part 5 Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public String calc(float operand1, float operand2, String op){
    float result = 0;
    if (op.equals("+")){
        result = operand1 + operand2;
    } else if (op.equals("-")) {
        result = operand1 - operand2;
    } else if (op.equals("×")) {
        result = operand1 * operand2;
    } else if (op.equals("÷")) {
        result = operand1 / operand2;
    }
    if (result % 1 == 0){
        int fixedNum = (int) result;
        return String.valueOf(fixedNum);
    } else { return String.valueOf(result); }
    }

    public static void main(String[] args){
        launch(args);
    }
}
