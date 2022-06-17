package collection.exercice1.formeGeo;

public class Carre implements ObjetGeometrique {

    private double cote;

    // Constructor
    public Carre(double cote) {
        this.setCote(cote);
    }

    // Getter
    public double getcote() {
        return cote;
    }

    // Setter
    public void setCote(double cote) {
        this.cote = cote;
    }


    // Methode
    @Override
    public double perimetre() {
        return cote * 4;
    }

    @Override
    public double aire() {
        return cote * cote;
    }

    @Override
    public String toString() {
        return "Carre [" + "cote = " + cote + "] Aire = " + aire() + ", Perimetre = " + perimetre();
    }

}
