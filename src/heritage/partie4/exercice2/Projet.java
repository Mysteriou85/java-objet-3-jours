package heritage.partie4.exercice2;

import java.util.Date;

public class Projet {

    private String nom;
    private Date debut;
    private Date fin;
    private int prixFactureMO;

    // Constructor
    public Projet(String nom, Date debut, Date fin, int prixFactureMO) {
        this.setNom(nom);
        this.setDebut(debut);
        this.setFin(fin);
        this.setPrixFactureMO(prixFactureMO);
    }

    // Getter
    public String getNom() {
        return nom;
    }

    public Date getDebut() {
        return debut;
    }

    public Date getFin() {
        return fin;
    }

    public int getPrixFactureMO() {
        return prixFactureMO;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public void setPrixFactureMO(int prixFactureMO) {
        this.prixFactureMO = prixFactureMO;
    }

    // Methode
    private void cumulCoutMP() {}

    public void margeBruteCourante() {}
}
