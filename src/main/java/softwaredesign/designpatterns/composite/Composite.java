package softwaredesign.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> components;

    public Composite() {
        components = new ArrayList<>();
    }

    @Override
    public void computeFunction() {
        doSomethingAdditional();
        for (Component component : components) {
            component.computeFunction();
        }
    }

    private void doSomethingAdditional(){

    };

}
