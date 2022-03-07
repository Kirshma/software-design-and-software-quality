package softwaredesign.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private State state = State.OPEN;

    private List<ConcreteObserver> concreteObserverList;

    public Subject(List<ConcreteObserver> concreteObserverList) {
        this.concreteObserverList = concreteObserverList;
        this.changeState(this.state);
    }

    public Subject() {
        this.concreteObserverList = new ArrayList<>();
    }

    public Subject(ConcreteObserver concreteObserver) {
        this();
        concreteObserverList.add(concreteObserver);
    }

    void register(ConcreteObserver concreteObserver) {
        if (concreteObserver !=null) {
            this.concreteObserverList.add(concreteObserver);
        }
    }

    void unregister(ConcreteObserver concreteObserver) {
        if (concreteObserver !=null) {
            this.concreteObserverList.remove(concreteObserver);
        }
    }

    void changeState(State state) {
        if (state!=null) {
            this.state = state;
        }
        for (ConcreteObserver concreteObserver : concreteObserverList) {
            concreteObserver.update(state);
        }
    }
}
