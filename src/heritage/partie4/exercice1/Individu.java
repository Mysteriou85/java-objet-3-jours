package heritage.partie4.exercice1;

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

    // Methode
    @Override
    public String toString() {
        return "Individu{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
