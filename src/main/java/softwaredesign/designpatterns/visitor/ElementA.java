package softwaredesign.designpatterns.visitor;

public class ElementA implements Element {


    @Override
    public void accept(Visitor visitor) {
        visitor.visitElement(this);
    }

    public void operationA() {}

}
