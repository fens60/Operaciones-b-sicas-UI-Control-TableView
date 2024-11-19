module com.example.working_with_javafxui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.working_with_javafxui to javafx.fxml;
    exports com.example.working_with_javafxui;
}