module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires jdk.unsupported.desktop;

    opens com.example.demo1 to javafx.fxml;
    exports com.example.demo1;
}