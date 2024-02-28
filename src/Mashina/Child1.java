package Mashina;

public class Child1 extends Parent {
    String additionalFeature;

    public Child1(String licence, String additionalFeature) {
        super(licence);
        this.additionalFeature = additionalFeature;
    }

    void driveWithAdditionalFeature() {
        System.out.println(licence + " toifasini " + additionalFeature + " bilan hayday oladi");
    }
}
