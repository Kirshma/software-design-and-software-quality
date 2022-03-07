package softwaredesign.designpatterns.decorator;

public abstract class BaseDecorator extends Notifier {

    Notifier baseDecorator;

    BaseDecorator(Notifier baseDecorator) {
        this.baseDecorator = baseDecorator;
    }

    abstract void sendMessage(String message);

}
