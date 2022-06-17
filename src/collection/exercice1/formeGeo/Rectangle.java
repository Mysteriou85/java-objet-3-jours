package collection.exercice1.formeGeo;

public class Rectangle implements ObjetGeometrique {

    private double longueur;
    private double largeur;

    // Constructor
    public Rectangle(double longueur, double largeur) {
        this.setLongueur(longueur);
        this.setLargeur(largeur);
    }

    // Getter
    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    // Setter
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Methode
    @Override
    public double perimetre() {
        return (longueur + largeur) * 2;
    }

    @Override
    public double aire() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle [" + "longueur = " + longueur + ", largeur = " + largeur + "] Aire = " + aire() + ", Perimetre = " + perimetre();
    }
}
