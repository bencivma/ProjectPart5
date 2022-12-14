package com.example.javafxintro;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Part5Calculator extends Application {

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

        Button num2 = new Button("2");
        pane.add(num2, 22, 5);

        Button plus = new Button("+");
        pane.add(plus, 24, 5);

        Button num3 = new Button("3");
        pane.add(num3, 10, 10);

        Button num4 = new Button("4");
        pane.add(num4, 22, 10);

        Button minus = new Button("-");
        pane.add(minus, 24, 10);

        Button num5 = new Button("5");
        pane.add(num5, 10, 15);

        Button num6 = new Button("6");
        pane.add(num6, 22, 15);

        Button divide = new Button("÷");
        pane.add(divide, 24, 15);

        Button num7 = new Button("7");
        pane.add(num7, 10, 20);

        Button num8 = new Button("8");
        pane.add(num8, 22, 20);

        Button times = new Button("×");
        pane.add(times, 24, 20);

        Button num9 = new Button("9");
        pane.add(num9, 10, 25);

        Button num0 = new Button("0");
        pane.add(num0, 22, 25);

        Button equals = new Button("=");
        pane.add(equals, 24, 25);







        pane.setStyle("-fx-background-color: #D8BFD8;");
        Scene scene = new Scene(pane, 400, 550);
        primaryStage.setTitle("Part 5 Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
