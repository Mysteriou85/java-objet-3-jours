package editeur;

public class Client {
    private String nom;
    private String prenom;
    private String adress;
    private int cp;
    private String ville;

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
