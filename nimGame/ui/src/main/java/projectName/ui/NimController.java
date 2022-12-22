package nimGame.ui;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.fxml.FXML;


public class NimController {

    @FXML Button stick1, stick21, stick22, stick23, stick31, stick32, stick33, stick34,
    stick35, stick41, stick42, stick43, stick44, stick45, stick46, stick47, restart, start, confirm;
    @FXML TextField spiller1, spiller2;
    @FXML Label overskrift, tekst1, tekst2, sinTur;
    String navn1;
    String navn2;

    private void checkPlayers() {
        if (spiller1.getText().equals("") || spiller2.getText().equals("")) {
            throw new IllegalArgumentException();

        }
    }

    @FXML private void handleStart() {
        try {
            checkPlayers();
            overskrift.setText(spiller1.getText());
            navn1 = spiller1.getText();
            navn2 = spiller2.getText();
            tekst1.setVisible(false);
            tekst2.setVisible(false);
            spiller1.setVisible(false);
            spiller2.setVisible(false);
            start.setVisible(false);

            stick1.setVisible(true);
            stick21.setVisible(true);
            stick22.setVisible(true);
            stick23.setVisible(true);
            stick31.setVisible(true);
            stick32.setVisible(true);
            stick33.setVisible(true);
            stick34.setVisible(true);
            stick35.setVisible(true);
            stick41.setVisible(true);
            stick42.setVisible(true);
            stick43.setVisible(true);
            stick44.setVisible(true);
            stick45.setVisible(true);
            stick46.setVisible(true);
            stick47.setVisible(true);
            restart.setVisible(true);
            confirm.setVisible(true);
            sinTur.setVisible(true);
        } catch (IllegalArgumentException e) {
            showError("Navnene på begge spillerne må fylles ut!");
        }

    }
   
    private void isGameover() {
        int count = 0;

        if (!stick1.isVisible()) {
            count++;
        }
        if (!stick21.isVisible()) {
            count++;
        }
        if (!stick22.isVisible()) {
            count++;
        }
        if (!stick23.isVisible()) {
            count++;
        }
        if (!stick31.isVisible()) {
            count++;
        }
        if (!stick32.isVisible()) {
            count++;
        }
        if (!stick33.isVisible()) {
            count++;
        }
        if (!stick34.isVisible()) {
            count++;
        }
        if (!stick35.isVisible()) {
            count++;
        }
        if (!stick41.isVisible()) {
            count++;
        }
        if (!stick42.isVisible()) {
            count++;
        }
        if (!stick43.isVisible()) {
            count++;
        }
        if (!stick44.isVisible()) {
            count++;
        }
        if (!stick45.isVisible()) {
            count++;
        }
        if (!stick46.isVisible()) {
            count++;
        }
        if (!stick47.isVisible()) {
            count++;
        }
        if (count == 16) {
            showGameOver();
        }
    }

    @FXML private void handleConfirm() {
        if (overskrift.getText().equals(navn1)) {
            overskrift.setText(navn2);
        } else {
            overskrift.setText(navn1);
        }
    }

    private String getWinningName() {
        if (overskrift.getText().equals(navn1)) {
            return navn2;
        } else {
            return navn1;
        }
    }

    private void showGameOver() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("GAME OVER");
        alert.setHeaderText(getWinningName() + " VANT SPILLET!");
        alert.showAndWait();
    }

    private void showError(String errorMessage) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText("Noe gikk galt!");
        alert.setContentText(errorMessage);
        alert.showAndWait();

    }

    @FXML private void handleRemoveStick1() {
        stick1.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick21() {
        stick21.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick22() {
        stick22.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick23() {
        stick23.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick31() {
        stick31.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick32() {
        stick32.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick33() {
        stick33.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick34() {
        stick34.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick35() {
        stick35.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick41() {
        stick41.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick42() {
        stick42.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick43() {
        stick43.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick44() {
        stick44.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick45() {
        stick45.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick46() {
        stick46.setVisible(false);
        isGameover();
    }

    @FXML private void handleRemoveStick47() {
        stick47.setVisible(false);
        isGameover();
    }

    @FXML private void handleRestart() {
        stick1.setVisible(true);
        stick21.setVisible(true);
        stick22.setVisible(true);
        stick23.setVisible(true);
        stick31.setVisible(true);
        stick32.setVisible(true);
        stick33.setVisible(true);
        stick34.setVisible(true);
        stick35.setVisible(true);
        stick41.setVisible(true);
        stick42.setVisible(true);
        stick43.setVisible(true);
        stick44.setVisible(true);
        stick45.setVisible(true);
        stick46.setVisible(true);
        stick47.setVisible(true);
















    }
    
}
