package softwaredesign.designpatterns.composite;

public class Main {

    public static void main(String[] args) {

        /* Composite Pattern */
        //Handles leaf and composites uniformly
        Component component = new Composite();
        component.add(new Leaf());
        component.add(new Composite());
        /*
        The following function is called on all leaf and composite components,
        thus the client doesn't need to differentiate and can easily add additional components,
        though with such an implementation one is losing the type safety, due to the leaf class inheriting composite functions from the abstract component class
        Another design approach puts the composite functions into the composite class only, but this loses the uniform access
         */
        component.computeFunction();

    }

}
