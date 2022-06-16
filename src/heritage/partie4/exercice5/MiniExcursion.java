package heritage.partie4.exercice5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MiniExcursion {
    private int numMiniExcursion;
    private String libelleMiniExcursion;
    private int nombrePlaces;
    List<Etape> lesEtapes = new ArrayList<>();

    public MiniExcursion(String libelleMiniExcursion, int nombrePlaces, List lesEtapes) {
        this.setLibelleMiniExcursion(libelleMiniExcursion);
        this.setNombrePlaces(nombrePlaces);
        this.lesEtapes = lesEtapes;
    }

    // Getter
    public int getNumMiniExcursion() {
        return numMiniExcursion;
    }

    public String getLibelleMiniExcursion() {
        return libelleMiniExcursion;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public List<Etape> getLesEtapes() {
        return lesEtapes;
    }

    // Setter
    public void setNumMiniExcursion(int numMiniExcursion) {
        this.numMiniExcursion = numMiniExcursion;
    }

    public void setLibelleMiniExcursion(String libelleMiniExcursion) {
        this.libelleMiniExcursion = libelleMiniExcursion;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    // Methode
    public void ajouteEtape(Etape uneEtape) {
        lesEtapes.add(uneEtape);
    }

//    // retourne la durée prévue formatée en minutes
//    public int donneDureePrevue() {
//        return du
//    }

    //retourne la durée prévue sous la forme HH:MM:SS exemple 02:05:50
    public LocalTime donneDureePrevueHHMM() {
        int dureePrevueTotal = 0;
        for (Etape lesEtape : lesEtapes) {
            dureePrevueTotal += lesEtape.getDureePrevue();
        }

        int heure = dureePrevueTotal / 60;
        int minute = dureePrevueTotal % 60;

        LocalTime value = LocalTime.of(heure, minute);
        return value;
    }
}
