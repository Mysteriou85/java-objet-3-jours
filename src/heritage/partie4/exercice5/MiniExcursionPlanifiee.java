package heritage.partie4.exercice5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MiniExcursionPlanifiee {
    private LocalDateTime heureDepart;
    private int nombreInscrits;
    private MiniExcursion laminiExcursion;

    // Constructor
    public MiniExcursionPlanifiee(String heureDepart, int nombreInscrits, MiniExcursion laminiExcursion) {
        this.setHeureDepartString(heureDepart);
        this.nombreInscrits = nombreInscrits;
        this.laminiExcursion = laminiExcursion;
    }

    public MiniExcursionPlanifiee(LocalDate heureDepart, int nombreInscrits, MiniExcursion laminiExcursion) {
        this.setHeureDepartLocalDate(heureDepart);
        this.nombreInscrits = nombreInscrits;
        this.laminiExcursion = laminiExcursion;
    }

    // Getter
    public LocalDateTime getHeureDepart() {
        return heureDepart;
    }

    public int getNombreInscrits() {
        return nombreInscrits;
    }

    public MiniExcursion getLaminiExcursion() {
        return laminiExcursion;
    }

    // Setter
    public void setHeureDepartString(String heureDepart) {
        this.heureDepart = LocalDateTime.of(LocalDate.now(), LocalTime.parse(heureDepart));
    }

    public void setHeureDepartLocalDate(LocalDate heureDepart) {
        this.heureDepart = heureDepart.atTime(23, 0, 0);
    }

    public void setNombreInscrits(int nombreInscrits) {
        this.nombreInscrits = nombreInscrits;
    }

    public void setLaminiExcursion(MiniExcursion laminiExcursion) {
        this.laminiExcursion = laminiExcursion;
    }


    // Methode
    public boolean estComplete() {
        if (nombreInscrits >= laminiExcursion.getNombrePlaces()) {
            return true;
        } else {
            return false;
        }
    }
}
