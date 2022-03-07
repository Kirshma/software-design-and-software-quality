package softwaredesign.designpatterns.adapter;

public class Wrapper {

    private LegacyClass wrappedLegacyClass;

    public Wrapper() {
        this.wrappedLegacyClass = new LegacyClass();
    }

    void doSomething() {
        System.out.println("");
        wrappedLegacyClass.doSomethingTheLegacyWay();
    }

}
