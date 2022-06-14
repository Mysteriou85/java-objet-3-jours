package heritage.exercice3;

public class Stagiaire extends Personne {
    private String dateNaissance;
    private String adresse;
    private String codePostal;
    private String ville;

    // Constructeur
    public Stagiaire(String nom, String prenom, String telephone, String dateNaissance, String adresse, String codePostal, String ville) {
        super(nom, prenom, telephone);
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    // Getter
    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getVille() {
        return ville;
    }

    // Setter
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    // toString

    @Override
    public String toString() {
        return super.toString() + "Stagiaire{" +
                "dateNaissance='" + dateNaissance + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
