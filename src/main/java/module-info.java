module com.example.basecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.basecalculator to javafx.fxml;
    exports com.example.basecalculator;
}