package heritage.partie4.exercice2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Hashtable;

public class Mission {

    private String nom;
    private String description;
    private int nbHeuresPrevues;
    private Hashtable<LocalDate, Integer> releveHoraire = new Hashtable<>();
    private Intervenant executant;

    // Constructor
    public Mission(String nom, String description, int nbHeuresPrevues, Intervenant executant) {
        this.setNom(nom);
        this.setDescription(description);
        this.setNbHeuresPrevues(nbHeuresPrevues);
        this.releveHoraire = releveHoraire;
        this.executant = executant;
    }

    // Getter
    public String getNom() {return nom;}
    public String getDescription() {return description;}
    public int getNbHeuresPrevues() {return nbHeuresPrevues;}
    public Hashtable getReleveHoraire() {
        return releveHoraire;
    }
    public Intervenant getExecutant() {return executant;}


    // Setter
    public void setNom(String nom) {this.nom = nom;}
    public void setDescription(String description) {this.description = description;}
    public void setNbHeuresPrevues(int nbHeuresPrevues) {this.nbHeuresPrevues = nbHeuresPrevues;}

    public void setReleveHoraire(Hashtable<LocalDate, Integer> releveHoraire) {
        this.releveHoraire = releveHoraire;
    }

    // Methode
    public double nbHeuresEffectuees () {
        double nbrHeurePrevues = 0;
        for (Integer value : releveHoraire.values()) {
            nbrHeurePrevues += value;
        }
        return nbrHeurePrevues;
    }

    public void ajoutReleve(LocalDate laDate, int nbreHeures) {
        releveHoraire.put(laDate, nbreHeures);
    }
}
