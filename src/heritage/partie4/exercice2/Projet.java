package heritage.partie4.exercice2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projet {

    private String nom;
    private LocalDate debut;
    private LocalDate fin;
    private int prixFactureMO;
    private List<Mission> lesMissions = new ArrayList<>();

    // Constructor
    public Projet(String nom, LocalDate debut, LocalDate fin, int prixFactureMO, List lesMissions) {
        this.setNom(nom);
        this.setDebut(debut);
        this.setFin(fin);
        this.setPrixFactureMO(prixFactureMO);
        this.lesMissions = lesMissions;
    }

    // Getter
    public String getNom() {
        return nom;
    }

    public LocalDate getDebut() {
        return debut;
    }

    public LocalDate getFin() {
        return fin;
    }

    public int getPrixFactureMO() {
        return prixFactureMO;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDebut(LocalDate debut) {
        this.debut = debut;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public void setPrixFactureMO(int prixFactureMO) {
        this.prixFactureMO = prixFactureMO;
    }

    // Methode
    private double cumulCoutMP() {
        double cout = 0;
        for (Mission lesMissions : lesMissions) {
            cout += (lesMissions.getExecutant().getTauxHoraire() * lesMissions.nbHeuresEffectuees());
        }
        return cout;
    }

    public double margeBruteCourante() {
        return  prixFactureMO - this.cumulCoutMP();
    }
}
