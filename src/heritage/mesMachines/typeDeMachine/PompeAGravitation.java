package heritage.mesMachines.typeDeMachine;

import heritage.mesMachines.Machine;

import java.time.LocalDate;

public class PompeAGravitation extends Machine {

    private int debit;
    private boolean eauOperationelle;

    public PompeAGravitation(LocalDate dateAchat, String marque, String modele, int debit, boolean eauOperationelle) {
        super(dateAchat, marque, modele);
        this.debit = debit;
        this.eauOperationelle = eauOperationelle;
    }

    @Override
    public String toString() {
        return "(" + debit + "L) " + super.toString();
    }

}
