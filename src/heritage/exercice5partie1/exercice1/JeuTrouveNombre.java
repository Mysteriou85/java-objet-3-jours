package heritage.exercice5partie1.exercice1;

import java.util.Random;
import java.util.Scanner;

public class JeuTrouveNombre {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int nombreAlea = random.nextInt(100) + 1;
    private int tentative = 10;

    public int getNombreAlea() {
        return nombreAlea;
    }

    public int getTentative() {
        return tentative;
    }

    public void jeu() {
        System.out.println("Veuillez entrer un nombre entre 1 et 100");
        System.out.printf("Vous avez %d tentative \n", tentative);
        while (tentative != 0) {
            int result = scanner.nextInt();
            if(result < nombreAlea) {
                System.out.println("Trop petit !");
                tentative--;
                System.out.println("Essais restant : " + tentative);
            } else if(result > nombreAlea) {
                System.out.println("Trop grand !");
                tentative--;
                System.out.println("Essais restant : " + tentative);
            } else if(result == nombreAlea) {
                System.out.println("Gagnez");
                restart();
            }
            if(tentative == 0) {
                System.out.println("Vous avez perdu");
                restart();
            }
        }
    }

    public void restart () {
        System.out.println("Voulez-vous refaire une partie ?");
        System.out.println("1. oui");
        System.out.println("2. Non");
        int restart = scanner.nextInt();
        if(restart == 1) {
            tentative = 10;
        } else if (restart == 2) {
            System.exit(0);
        } else {
            System.out.println("Mauvaise entrée");
        }
    }
}
