package softwaredesign.designpatterns.decorator;

public class Notifier {

    void sendMessage(String message) {
        System.out.println("This message is sent as an E-mail: \n" + message);
    }

}
