module com.example.javafxintro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxintro to javafx.fxml;
    exports com.example.javafxintro;
}