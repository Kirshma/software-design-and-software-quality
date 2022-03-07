package softwaredesign.designpatterns.decorator;

public class TeamsDecorator extends BaseDecorator{


    TeamsDecorator(Notifier baseDecorator) {
        super(baseDecorator);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("This message is sent to the teams app: \n" + message);
        baseDecorator.sendMessage(message);
    }
}
