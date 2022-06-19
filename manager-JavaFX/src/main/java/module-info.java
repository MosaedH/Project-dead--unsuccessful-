module com.keithaya.keithaya {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.manager.manager to javafx.fxml;
    exports com.manager.manager;
}