package heritage.exercice5partie1.exercice1;

import java.util.Random;
import java.util.Scanner;

public class JeuTrouveNombre {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int nombreAlea = random.nextInt(100) + 1;
    private int tentative;

    public int getNombreAlea() {
        return nombreAlea;
    }

    public int getTentative() {
        return tentative;
    }
}
