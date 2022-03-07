package softwaredesign.architectures.modelviewcontroller;

public class Controller {

    Model model;

    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void increaseInt() {
        model.setNumber(model.getNumber()+1);
    }

    public void differentText(String string) {
        model.setString(string);
    }
}
