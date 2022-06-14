package editeur;

public class Client {
    String nom;
    String prenom;
    String adress;
    int cp;
    String ville;

    // Constructor
    public Client(String nom, String prenom, String adress, int cp, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.cp = cp;
        this.ville = ville;
    }

    // ToString
    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adress='" + adress + '\'' +
                ", cp=" + cp +
                ", ville='" + ville + '\'' +
                '}';
    }
}
