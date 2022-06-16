package heritage.partie4.exercice4;

public abstract class Emplacement {
    private int dimension;
    private int couleur;
    private int xCentre;
    private int yCentre;

    // constructeur ecrit dans le parent qui ne peut être utilisé que par les classes filles
    protected Emplacement(int couleur, int xCentre, int yCentre)
    {
        this.setCouleur(couleur);
        this.setxCentre(xCentre);
        this.setyCentre(yCentre);
    }
    abstract String affiche();

    // Getter
    public int getCouleur() {
        return couleur;
    }

    public int getxCentre() {
        return xCentre;
    }

    public int getyCentre() {
        return yCentre;
    }

    // Setter
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public void setxCentre(int xCentre) {
        this.xCentre = xCentre;
    }

    public void setyCentre(int yCentre) {
        this.yCentre = yCentre;
    }

    @Override
    public String toString() {
        return "Emplacement {" +
                "dimension : " + dimension +
                ", couleur : " + couleur +
                ", xCentre : " + xCentre +
                ", yCentre : " + yCentre +
                '}';
    }
}
