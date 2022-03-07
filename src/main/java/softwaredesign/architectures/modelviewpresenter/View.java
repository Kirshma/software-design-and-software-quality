package softwaredesign.architectures.modelviewpresenter;

public class View {

    private Presenter presenter;

    void printViewState(int number, String string){
        System.out.println("The view displays a model with the number " + number + " and the text " + string);
    }

    void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    void intChangedByUser(int number) {
        presenter.update(number);
    }

    void stringChangedByUser(String string) {
        presenter.update(string);
    }

}
