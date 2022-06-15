package heritage.exercice3;

public class Formateur extends Personne {
    private int numeroIntervenant;
    private String dateDeCreation;
    private static int nombreIntervenant;

    // Constructor
    public Formateur(String nom, String prenom, String telephone, String dateDeCreation) {
        super(nom, prenom, telephone);
        this.setNombreIntervenant();
        this.numeroIntervenant = nombreIntervenant;
        this.setDateDeCreation(dateDeCreation);
    }

    // Getter
    public int getNumeroIntervenant() {
        return numeroIntervenant;
    }

    public String getDateDeCreation() {
        return dateDeCreation;
    }

    public int getNombreIntervenant() {
        return nombreIntervenant;
    }

    // Setter
    public void setNumeroIntervenant(int numeroIntervenant) {
        this.numeroIntervenant++;
    }

    public void setDateDeCreation(String dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public void setNombreIntervenant() {
        this.nombreIntervenant++;
    }

    @Override
    public String toString() {
        return super.toString() + "Formateur{" +
                "numeroIntervenant=" + numeroIntervenant +
                ", dateDeCreation='" + dateDeCreation + '\'' +
                ", nombreIntervenant=" + nombreIntervenant +
                '}';
    }
}
