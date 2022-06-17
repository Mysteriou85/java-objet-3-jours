package collection.exercice1.formeGeo;

public class Triangle implements ObjetGeometrique {
    private double base;
    private double hauteur;

    // Constructor
    public Triangle(double base, double hauteur) {
        this.setBase(base);
        this.setHauteur(hauteur);
    }

    // Getter
    public double getBase() {
        return base;
    }

    public double getHauteur() {
        return hauteur;
    }

    // Setter
    public void setBase(double base) {
        this.base = base;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    // Methode
    @Override
    public double perimetre() {
        return base + hauteur + Math.sqrt(base * base + hauteur * hauteur) ;
    }

    @Override
    public double aire() {
        return (base * hauteur) / 2;
    }

    @Override
    public String toString() {
        return "Triangle [" + "base = " + base + ", hauteur = " + hauteur + "] Aire = " + aire() + ", Perimetre = " + perimetre();
    }
}
