package collection.exercice1.formeGeo;

public class Cercle implements ObjetGeometrique {

    public double rayon;

    // Constructor
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Getter
    public double getRayon() {
        return rayon;
    }

    // Setter
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * rayon * Math.PI;
    }
    @Override
    public double aire() {
        return (2 * rayon) * Math.PI;
    }

    @Override
    public String toString() {
        return "Cercle [" + "rayon = " + rayon + "] Aire = " + aire() + ", Perimetre = " + perimetre();
    }
}
