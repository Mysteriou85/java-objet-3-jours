package heritage.partie4.exercice1;

import java.awt.*;

public class Voiture {

    private int num_serie;
    private String immatriculation;
    private String marque;
    private Color couleur;
    private int annee;
    private Individu proprietaire;

    // COnstructor
    public Voiture(int num_serie, String immatriculation, String marque, Color couleur, int annee) {
        this.num_serie = num_serie;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.annee = annee;
    }

    // Getter
    public int getNum_serie() {
        return num_serie;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public Color getCouleur() {
        return couleur;
    }

    public int getAnnee() {
        return annee;
    }

    public Individu getProprietaire() {
        return proprietaire;
    }


    // Setter
    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setProprietaire(Individu proprietaire) {
        this.proprietaire = proprietaire;
    }

    // Methode
    @Override
    public String toString() {
        return "Voiture{" +
                "num_serie=" + num_serie +
                ", immatriculation='" + immatriculation + '\'' +
                ", marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", annee='" + annee + '\'' +
                '}';
    }

    public void demarrer() {}
    public void klaxonner() {}
    public void conduire() {}
    public void arreter() {}



}
