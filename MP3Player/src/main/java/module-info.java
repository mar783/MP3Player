module MP3Player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires jid3lib;

    exports pl.main to javafx.graphics;
    opens pl.controller to javafx.fxml;
    opens pl.mp3 to javafx.base;
}