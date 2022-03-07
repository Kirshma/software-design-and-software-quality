package softwaredesign.designpatterns.bridge;

public class Implementor1 implements Implementor{
    @Override
    public void operationImplementation() {
        System.out.println("Implementor1's print implementation");
    }
}
