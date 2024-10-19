module com.example.pumpkin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.pumpkin to javafx.fxml;
    exports com.example.pumpkin;
    exports com.example.pumpkin.model;
    opens com.example.pumpkin.model to javafx.fxml;
    exports com.example.pumpkin.controller;
    opens com.example.pumpkin.controller to javafx.fxml;
}
