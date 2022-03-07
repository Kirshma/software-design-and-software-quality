package softwaredesign.architectures.modelviewcontroller;

import softwaredesign.designpatterns.observer.Observer;

public class View implements Observer<Model> {

    Model model;
    Controller controller;

    View(Model model){
        this.model = model;
    }

    void printViewState(){
        System.out.println("The view displays a model with the number " + model.getNumber() + " and the text " + model.getString());
    }

    void userIncreasesIntInTheView() {
        controller.increaseInt();
    }

    void userTypesANewText(String text) {
        controller.differentText(text);
    }

    @Override
    public void update(Model model) {
        this.model = model;
    }

    void registerController(Controller controller){
        this.controller = controller;
    }

}
