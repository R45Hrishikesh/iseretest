module com.example.ise2retest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ise2retest to javafx.fxml;
    exports com.example.ise2retest;
}