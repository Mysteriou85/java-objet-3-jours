package heritage.mesMachines.typeDeMachine;

import heritage.mesMachines.Machine;

import java.time.LocalDate;

public class MachineEssence extends Machine {
    private int puissanceCV;

    public MachineEssence(LocalDate dateAchat, String marque, String modele, int puissanceCV) {
        super(dateAchat, marque, modele);
        this.puissanceCV = puissanceCV;
    }

    @Override
    public String toString() {
        return "(" + puissanceCV + "CV) " + super.toString();
    }
}
