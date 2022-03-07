package softwaredesign.architectures.modelviewpresenter;

public class Main {

    public static void main(String[] args) {
        /*
        In contrast to MVC, in MVP the view does not know about a model
        The presenter feeds data to the view when the model changes
        It also updates the model when user events from the view trigger a change in data
        */
        Model model = new Model();
        View view = new View();
        Presenter presenter = new Presenter(model, view);
        model.setPresenter(presenter);
        view.setPresenter(presenter);
        presenter.presentView();

        //Testing view changes
        view.intChangedByUser(5);
        view.stringChangedByUser("user change");
        presenter.presentView();

        //Testing model changes
        model.setNumber(10);
        model.setString("updated Model");
        presenter.presentView();
    }

}
