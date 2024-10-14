module com.example.pumpkin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pumpkin to javafx.fxml;
    exports com.example.pumpkin;
}