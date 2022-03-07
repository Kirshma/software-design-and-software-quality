package softwaredesign.designpatterns.visitor;

public class Visitor1 implements Visitor {

    @Override
    public void visitElement(ElementA elementA) {
        elementA.operationA();
    }

    @Override
    public void visitElement(ElementB elementB) {
        elementB.operationB();
    }
}
