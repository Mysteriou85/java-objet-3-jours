package editeur;

public class Livre {
    private String titre;
    private String auteur;
    private double prix;
    private int nbpages;
    private long isbn;
    private String annee;

    // Constructor
    public Livre() {
    }

    public Livre(String titre, int nbpages, long isbn) {
        this.titre = titre;
        this.nbpages = nbpages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, int nbpages, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbpages = nbpages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, double prix, int nbpages, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbpages = nbpages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, double prix, int nbpages, long isbn, String annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.nbpages = nbpages;
        this.isbn = isbn;
        this.annee = annee;
    }

    // Getter
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public double getPrix() {
        return prix;
    }

    public int getNbpages() {
        return nbpages;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getAnnee() {
        return annee;
    }

    // Setter
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setNbpages(int nbpages) {
        this.nbpages = nbpages;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    // toString

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", nbpages=" + nbpages +
                ", isbn=" + isbn +
                ", annee='" + annee + '\'' +
                '}';
    }
}
