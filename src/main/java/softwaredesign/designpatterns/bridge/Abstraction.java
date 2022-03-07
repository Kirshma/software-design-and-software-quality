package softwaredesign.designpatterns.bridge;

public abstract class Abstraction {

    Implementor implementor;

    public abstract void operation();


    public void setImplementor(Implementor implementor) {
        if (implementor!=null) {
            this.implementor = implementor;
        }
    }
}
