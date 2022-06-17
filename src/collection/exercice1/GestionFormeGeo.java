package collection.exercice1;

import collection.exercice1.formeGeo.*;

import java.util.*;

public class GestionFormeGeo {
    Scanner scanner = new Scanner(System.in);
    Queue<String> objet = new PriorityQueue<>();

    int formeChoisie;
    int process = 1;

    public void ajoutForme() {

        do {
            System.out.println("Quelle forme voulez-vous\n(1 - triangle, 2 - carré, 3 - rectangle, 4 - cercle, 5 - losange)");
            formeChoisie = scanner.nextInt();
            switch (formeChoisie) {
                case 1:
                    faireTriangle();
                    continueProgramme();
                    break;
                case 2:
                    faireCarre();
                    continueProgramme();
                    break;
                case 3:
                    faireRectangle();
                    continueProgramme();
                    break;
                case 4:
                    faireCercle();
                    continueProgramme();
                    break;
                case 5:
                    faireLosange();
                    continueProgramme();
                    break;
            }
        } while (process == 1);

        for (String objetGeometrique : objet) {
            System.out.println("Forme : " + objetGeometrique);
        }
    }

    public void continueProgramme() {
        System.out.println("Une autre forme (1 - oui, 2 - non) ?");
        process = scanner.nextInt();
        switch (process) {
            case 1:
                process = 1;
                break;
            case 2:
                process = 0;
                break;
        }
    }

    public void faireTriangle() {
        double base;
        double hauteur;

        System.out.println("Quelle est la longueur de la base ?");
        base = scanner.nextInt();
        System.out.println("Quelle est la longueur de la hauteur ?");
        hauteur = scanner.nextInt();
        Triangle triangle = new Triangle(base, hauteur);
        objet.add(triangle.toString());
    }

    public void faireCarre() {
        double cote;

        System.out.println("Quelle est le côté du carré ?");
        cote = scanner.nextInt();
        Carre carre = new Carre(cote);
        objet.add(carre.toString());
    }

    public void faireRectangle() {
        double longueur;
        double largeur;

        System.out.println("Quelle est la longueur ?");
        longueur = scanner.nextInt();
        System.out.println("Quelle est la largeur ?");
        largeur = scanner.nextInt();
        Rectangle rectangle = new Rectangle(longueur, largeur);
        objet.add(rectangle.toString());
    }

    public void faireCercle() {
        double rayon;
        System.out.println("Quelle est le rayon ?");
        rayon = scanner.nextInt();
        Cercle cercle = new Cercle(rayon);
        objet.add(cercle.toString());
    }

    public void faireLosange() {
        double diagonale1;
        double diagonale2;

        System.out.println("Quelle est la longueur la première diagonale ?");
        diagonale1 = scanner.nextInt();
        System.out.println("Quelle est la longueur de la seconde diagonale");
        diagonale2 = scanner.nextInt();
        Losange losange = new Losange(diagonale1, diagonale2);
        objet.add(losange.toString());
    }

}
