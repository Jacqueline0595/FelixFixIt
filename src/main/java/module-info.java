module com.example.pruebaventana {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebaventana to javafx.fxml;
    exports com.example.pruebaventana;
}