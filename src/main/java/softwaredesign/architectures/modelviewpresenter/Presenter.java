package softwaredesign.architectures.modelviewpresenter;

public class Presenter {

    Model model;
    View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    void update(int number) {
        this.model.setNumber(number);
    }

    void update(Model model) {
        this.model = model;
    }

    void update(String string) {
        this.model.setString(string);
    }

    void presentView(){
        this.view.printViewState(model.getNumber(), model.getString());
    }
}
