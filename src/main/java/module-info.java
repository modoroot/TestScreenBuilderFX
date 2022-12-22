module TestScreenBuilderFX {
    requires javafx.controls;
    requires javafx.fxml;
    opens model to javafx.graphics, javafx.fxml;
    opens view to javafx.graphics, javafx.fxml;
    opens controller to javafx.graphics, javafx.fxml;
}