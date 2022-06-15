package heritage.partie4.exercice2;

import java.util.Date;

public class Mission {

    private String nom;
    private String description;
    private int nbHeuresPrevues;
    private String releveHoraire;

    // Constructor
    public Mission(String nom, String description, int nbHeuresPrevues, String releveHoraire) {
        this.setNom(nom);
        this.setDescription(description);
        this.setNbHeuresPrevues(nbHeuresPrevues);
        this.setReleveHoraire(releveHoraire);
    }

    // Getter
    public String getNom() {return nom;}
    public String getDescription() {return description;}
    public int getNbHeuresPrevues() {return nbHeuresPrevues;}
    public String getReleveHoraire() {return releveHoraire;}

    // Setter
    public void setNom(String nom) {this.nom = nom;}
    public void setDescription(String description) {this.description = description;}
    public void setNbHeuresPrevues(int nbHeuresPrevues) {this.nbHeuresPrevues = nbHeuresPrevues;}
    public void setReleveHoraire(String releveHoraire) {this.releveHoraire = releveHoraire;}

    // Methode
    public void ajouteReleve(Date jour, int nbHeures) {

    }

    public void nbHeuresEffectuees () {

    }
}
