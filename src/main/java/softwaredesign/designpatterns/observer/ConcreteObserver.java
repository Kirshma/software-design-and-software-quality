package softwaredesign.designpatterns.observer;

public class ConcreteObserver implements Observer<State> {

    State stateOfTheProgramNeeded;

    public void update(State state) {
        if (state!=null) {
            this.stateOfTheProgramNeeded = state;
        }
    }

    void printState() {
        System.out.println("The connection is " + stateOfTheProgramNeeded.toString());
    }


}
