package softwaredesign.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    private List<Component> components;

    public Component() {
        components = new ArrayList<>();
    }

    public boolean add(Component component){

        if (component == null) {
            throw new IllegalArgumentException("Added component was null");
        }

        return components.add(component);

    }

    public Component get(int index){
        if (index <0 || index >= components.size()) {
            throw new IllegalArgumentException("Index was out of bounds");
        }
        return components.get(index);
    }

    public Component remove(int index) {
        if (index <0 || index >= components.size()) {
            throw new IllegalArgumentException("Index was out of bounds");
        }
        return components.remove(index);
    }

    public void computeFunction() {
        for (Component component : components) {
            component.computeFunction();
        }
    }

}
