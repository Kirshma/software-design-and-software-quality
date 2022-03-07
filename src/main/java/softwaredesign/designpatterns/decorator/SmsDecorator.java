package softwaredesign.designpatterns.decorator;

public class SmsDecorator extends BaseDecorator {

    SmsDecorator(Notifier baseDecorator) {
        super(baseDecorator);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("This message is sent as an SMS: \n" + message);
        baseDecorator.sendMessage(message);
    }

}
