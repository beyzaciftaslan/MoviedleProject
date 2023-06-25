module com.example.moviedle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.moviedle to javafx.fxml;
    exports com.example.moviedle;
}