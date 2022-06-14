package heritage.exercice3;

public class TestExercice3 {
    public static void main(String[] args) {

        Formateur formateur = new Formateur(
                "Bob",
                "bobi",
                "06",
                01,
                "26/05/1999",
                10
        );

        Stagiaire stagiaire = new Stagiaire(
                "George",
                "bobus",
                "06",
                "05/05/2010",
                "2 rue de la Grotte",
                "85400",
                "Nullpart"
        );

        System.out.println(stagiaire.toString());
        System.out.println(formateur.toString());

    }
}
