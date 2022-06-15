package heritage.partie4.exercice2;

public class Intervenant {
    private String nom;
    private int tauxHoraire;

    // Constructor
    public Intervenant(String nom, int tauxHoraire) {
        this.setNom(nom);
        this.setTauxHoraire(tauxHoraire);
    }

    // Getter
    public String getNom() {
        return nom;
    }

    public int getTauxHoraire() {
        return tauxHoraire;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTauxHoraire(int tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }
}
