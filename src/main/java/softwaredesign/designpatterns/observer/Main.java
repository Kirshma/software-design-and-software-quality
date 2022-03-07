package softwaredesign.designpatterns.observer;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        The ConcreteObserver pattern is useful in event driven publish-subscribe relationships between components
        The observers are registered to the class "Subject" in order to be informed when "Subject's" internal "State" changes
        When the "State" of "Subject" changes it calls the update() function of every subscribed/registered ConcreteObserver instance
         */
        ConcreteObserver concreteObserver = new ConcreteObserver();
        ConcreteObserver concreteObserver2 = new ConcreteObserver();
        ConcreteObserver concreteObserver3 = new ConcreteObserver();
        List<ConcreteObserver> concreteObserverList = Arrays.asList(concreteObserver, concreteObserver2, concreteObserver3);
        Subject subject = new Subject(concreteObserverList);
        concreteObserver2.printState();
        subject.changeState(State.CLOSED);
        concreteObserver2.printState();
        concreteObserver3.printState();
    }

}
