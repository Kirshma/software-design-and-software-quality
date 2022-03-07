package softwaredesign.designpatterns.bridge;

public class Abstraction1 extends Abstraction {

    public Abstraction1(Implementor implementor) {
        super();
        super.implementor = implementor;
    }

    @Override
    public void operation() {
        implementor.operationImplementation();
    }

}
