module com.example.radibuttons {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.radibuttons to javafx.fxml;
    exports com.example.radibuttons;
}