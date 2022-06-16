package heritage.partie4.exercice5;

import java.time.LocalDate;
import java.time.LocalTime;

public class Etape {
    private static int numEtape;
    private String description;
    private int dureePrevue;

    public Etape(String description, int dureePrevue) {
        this.setDescription(description);
        this.setDureePrevue(dureePrevue);
        this.setNumEtape();
    }

    // Getter
    // retourne le numéro de l 'étape
    public int getNumEtape() {
        return numEtape;
    }

    public String getDescription() {
        return description;
    }

    public int getDureePrevue() {
        return dureePrevue;
    }

    // Setter
    public void setDescription(String description) {
        this.description = description;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }

    public void setNumEtape() {
        this.numEtape++;
    }

    // Methode
    //retourne la durée prévue sous la forme HH:MM:SS exemple 02:05:23
    public LocalTime donneDureePrevueHHMM() {
        int heure = dureePrevue / 60;
        int minute = dureePrevue % 60;

        LocalTime value = LocalTime.of(heure, minute);
        return value;
    }
}

