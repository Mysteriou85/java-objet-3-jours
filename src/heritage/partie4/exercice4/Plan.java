package heritage.partie4.exercice4;

import java.util.ArrayList;
import java.util.List;

public class Plan {
    private int echelle;
    private String nomFichier;

    List<Emplacement> emplacementList = new ArrayList<>();

    // Constructor
    public Plan(String nomFichier) {
        this.setNomFichier(nomFichier);
    }

    // Getter
    public int getEchelle() {
        return echelle;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    // Setter
    public void setEchelle(int echelle) {
        this.echelle = echelle;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    // Methode
    public void ajouteEmplacement(Emplacement emplacement) {
        emplacementList.add(emplacement);
    }

    public void supprimeEmplacement(Emplacement emplacement) {
        if (emplacementList.contains(emplacement)) {
            emplacementList.remove(emplacement);
        } else {
            System.out.println("Cette emplacement n'existe pas");
        }
    }

    public String affichePlan() {
        return emplacementList.toString();
    }

    @Override
    public String toString() {
        return "Plan{" +
                "echelle=" + echelle +
                ", nomFichier='" + nomFichier + '\'' +
                '}';
    }
}
