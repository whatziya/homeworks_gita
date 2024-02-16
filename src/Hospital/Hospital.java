package Hospital;

import java.util.List;

public class Hospital {
    public void performProcedures(List<MedicalProcedure> procedures) {
        for (MedicalProcedure procedure : procedures) {
            procedure.performProcedure();
        }
    }
}