module com.example.buhalisgard_defend {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.buhalisgard_defend to javafx.fxml;
    exports com.example.buhalisgard_defend;
}