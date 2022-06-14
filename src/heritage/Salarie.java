package heritage;

public class Salarie extends Individu {
    private int salaire;

    public Salarie(String nom, String prenom, int salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    // Getter
    public int getSalaire() {
        return salaire;
    }

    // Setter
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString()+" = " + getSalaire()+"€/mois";
    }
}
