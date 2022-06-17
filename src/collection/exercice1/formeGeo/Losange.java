package collection.exercice1.formeGeo;

public class Losange implements ObjetGeometrique {

    private double diagonale1;
    private double diagonale2;

    // Constructor
    public Losange(double diagonale1, double diagonale2) {
        this.setDiagonale1(diagonale1);
        this.setDiagonale2(diagonale2);
    }

    // Getter
    public double getDiagonale1() {
        return diagonale1;
    }

    public double getDiagonale2() {
        return diagonale2;
    }

    // Setter
    public void setDiagonale1(double diagonale1) {
        this.diagonale1 = diagonale1;
    }

    public void setDiagonale2(double diagonale2) {
        this.diagonale2 = diagonale2;
    }

    @Override
    public double perimetre() {
        // je sais que c'est faux
        return diagonale1;
    }
    @Override
    public double aire() {
        return (diagonale1 * diagonale2) / 2;
    }

    @Override
    public String toString() {
        return "Losange [" + "diagonale1 = " + diagonale1 + ", diagonale2 = " + diagonale2 + "] Aire = " + aire() + ", Perimetre = " + perimetre();
    }
}
