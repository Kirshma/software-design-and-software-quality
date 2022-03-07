package softwaredesign.designpatterns.visitor;

public class Main {

    public static void main(String[] args) {
        /* Visitor Pattern */
        //Add functionality to an established structure by adding a visitor without modifying the hierarchy
        Element element = new ElementA();
        Visitor visitor = new Visitor1();
        element.accept(visitor);
    }
}
