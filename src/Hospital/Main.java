package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        List<MedicalProcedure> procedures = new ArrayList<>();
        procedures.add(new Appendectomy());
        procedures.add(new FractureTreatment());

        hospital.performProcedures(procedures);
    }
}