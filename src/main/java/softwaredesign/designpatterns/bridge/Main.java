package softwaredesign.designpatterns.bridge;

public class Main {

    public static void main(String[] args) {
        /* Bridge Pattern */
        //If class abstractions and implementations often change, make two hierarchies,
        //one with abstractions, second with implementations only, so that they are more interchangeable and independent
        Implementor implementor = new Implementor1();
        Abstraction abstraction = new Abstraction1(implementor);

        //The following operation is delegated to the implementor instance and interchangeable by swapping it
        abstraction.operation();
        abstraction.setImplementor(new Implementor2());
        abstraction.operation();
    }
}
