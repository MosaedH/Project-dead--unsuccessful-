module com.example.memberlist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.memberlist.main to javafx.fxml;
    exports com.memberlist.main;
}