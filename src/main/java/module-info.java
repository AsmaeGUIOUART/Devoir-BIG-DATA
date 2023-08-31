module com.example.devoirbigdata {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.devoirbigdata to javafx.fxml;
    exports com.example.devoirbigdata;
}