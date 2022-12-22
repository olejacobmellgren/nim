module nimGame.ui {
    
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires nimGame.core;

    opens nimGame.ui to javafx.graphics, javafx.fxml;
}
