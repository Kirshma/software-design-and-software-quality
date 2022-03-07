package softwaredesign.designpatterns.command;

public class MainClient {



    public static void main(String[] args) throws InterruptedException {
        Receiver receiver = new Receiver("Current information");

        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(concreteCommand);

        Thread.sleep(4000);

        ConcreteCommand concreteCommand2 = new ConcreteCommand(new Receiver("Some other information"));

        invoker.addCommand(concreteCommand2);
    }

}
