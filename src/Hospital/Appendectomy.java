package Hospital;

public class Appendectomy implements MedicalProcedure{

    @Override
    public void performProcedure() {
        System.out.println("Performing appendectomy procedure...");
    }
}
