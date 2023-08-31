module com.example.heritage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.heritage to javafx.fxml;
    exports com.example.heritage;
}