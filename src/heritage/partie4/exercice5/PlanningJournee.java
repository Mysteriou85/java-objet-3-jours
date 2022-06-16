package heritage.partie4.exercice5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlanningJournee {
    private LocalDate laDate;
    private List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees;

    public PlanningJournee(LocalDate laDate, List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees) {
        this.laDate = laDate;
        this.lesMiniExcursionsPlanifiees = lesMiniExcursionsPlanifiees;
    }

    // Getter
    public LocalDate getLaDate() {
        return laDate;
    }

    public List<MiniExcursionPlanifiee> getLesMiniExcursionsPlanifiees() {
        return lesMiniExcursionsPlanifiees;
    }

    // Setter
    public void setLaDate(LocalDate laDate) {
        this.laDate = laDate;
    }

    public void setLesMiniExcursionsPlanifiees(List<MiniExcursionPlanifiee> lesMiniExcursionsPlanifiees) {
        this.lesMiniExcursionsPlanifiees = lesMiniExcursionsPlanifiees;
    }
}
