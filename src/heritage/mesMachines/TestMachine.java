package heritage.mesMachines;

import heritage.mesMachines.typeDeMachine.BassinADecanter;
import heritage.mesMachines.typeDeMachine.MachineElectrique;
import heritage.mesMachines.typeDeMachine.MachineEssence;
import heritage.mesMachines.typeDeMachine.PompeAGravitation;

import java.time.LocalDate;
import java.time.Month;

public class TestMachine {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 05, 15);

        BassinADecanter bassinADecanter = new BassinADecanter(date, "Marque", "v1", 15);
        MachineElectrique machineElectrique = new MachineElectrique(date, "Jolie", "v1.5", 250);
        MachineEssence machineEssence = new MachineEssence(date, "Test", "v1", 10);
        PompeAGravitation pompeAGravitation = new PompeAGravitation(date, "Marque2", "v2", 15, false);


        System.out.println(bassinADecanter);
        System.out.println(machineElectrique);
        System.out.println(machineEssence);
        System.out.println(pompeAGravitation);

    }
}
