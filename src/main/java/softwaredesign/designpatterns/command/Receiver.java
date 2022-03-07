package softwaredesign.designpatterns.command;

public class Receiver {

    String information;

    public Receiver(String information) {
        this.information = information;

    }
    void printInfo() {
        System.out.println(this.information);
    }

}
