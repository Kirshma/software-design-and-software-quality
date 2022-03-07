package softwaredesign.architectures.modelviewpresenter;

public class Model {

    private int number = 0;
    private String string = "information";
    private Presenter presenter;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        presenter.update(this);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
        presenter.update(this);
    }

    void printModelState(){
        System.out.println("The model currently has the number " + number + " and the text " + string);
    }

    void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
}
