package heritage.exercice3;

public class TestExercice3 {
    public static void main(String[] args) {

        Formateur formateur1 = new Formateur(
                "Bob",
                "bobi",
                "06",
                "26/05/1999"
        );

        Formateur formateur2 = new Formateur(
                "Bob",
                "ross",
                "07",
                "26/05/1999"
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
        System.out.println(formateur1.toString());
        System.out.println(formateur2.toString());

    }
}
