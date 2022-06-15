package heritage.partie4.exercice2;

public class Intervenant {
    private String nom;
    private double tauxHoraire;

    // Constructor
    public Intervenant(String nom, double tauxHoraire) {
        this.setNom(nom);
        this.setTauxHoraire(tauxHoraire);
    }

    // Getter
    public String getNom() {
        return nom;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
