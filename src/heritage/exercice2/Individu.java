package heritage.exercice2;

public class Individu {
    private String nom;
    private String prenom;

    // Constructor
    public Individu(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getter
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "prénom = " + getPrenom()+", nom = " + getNom();
    }
}
