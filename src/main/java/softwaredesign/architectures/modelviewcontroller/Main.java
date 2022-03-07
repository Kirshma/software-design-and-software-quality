package softwaredesign.architectures.modelviewcontroller;

public class Main {

    public static void main(String[] args) {

        /*
        Configuration:
        Model holds the actual data and is instantiated first, e.g. here it contains an int and a String
        The view needs a model in order to display the data from it
        After the view is created it is registered as an observer to the model, so that it is notified of state changes of the model
        Then the controller is created which aggregates both the model and the view as fields
        Lastly the controller is registered as an observer to the view, so that it is notified of state changes of the view
         */
        Model model = new Model();
        View view = new View(model);
        model.registerView(view);
        Controller controller = new Controller(model, view);
        view.registerController(controller);
        view.printViewState();

        //The following code examples show a user interaction in the view which delegates changes to its controller field
        view.userIncreasesIntInTheView();
        view.printViewState();
        view.userTypesANewText("Hello world");
        view.printViewState();

        //Now the model is changed without a user input, this should update the view due to the observer pattern involved
        model.setString("was changed internally");
        model.setNumber(7);
        view.printViewState();

    }
}
