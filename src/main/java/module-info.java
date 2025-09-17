module com.example.javafxalakzat13a {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxalakzat13a to javafx.fxml;
    exports com.example.javafxalakzat13a;
}