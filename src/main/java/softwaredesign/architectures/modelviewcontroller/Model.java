package softwaredesign.architectures.modelviewcontroller;

public class Model {

    private View view;
    private int number = 0;
    private String string = "information";

    public void registerView(View view) {
        this.view = view;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        updateView();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
        updateView();
    }

    void printModelState(){
        System.out.println("The model currently has the number " + number + " and the text " + string);
    }

    void updateView() {
        view.update(this);
    }



}
