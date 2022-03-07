package softwaredesign.designpatterns.adapter;

public class NewApplication {


    public static void main(String[] args) {
        /*
        Adapting an old component to a new application or two versions of code into a unified interface.
        The Adapter pattern can also be used to unify two similar interfaces where one is used preferably.
        */
        Wrapper wrapper = new Wrapper();
        wrapper.doSomething();
    }

}
