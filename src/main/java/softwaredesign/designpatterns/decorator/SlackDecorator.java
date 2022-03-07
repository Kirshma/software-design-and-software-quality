package softwaredesign.designpatterns.decorator;

public class SlackDecorator extends BaseDecorator {

    SlackDecorator(Notifier baseDecorator) {
        super(baseDecorator);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("This message is sent to Slack: \n" + message);
        baseDecorator.sendMessage(message);
    }

}
