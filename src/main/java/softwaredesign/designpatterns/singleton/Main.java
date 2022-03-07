package softwaredesign.designpatterns.singleton;

public class Main {

    public static void main(String[] args) {
        /* Singleton Pattern */
        //Useful when you want to restrict the creation of object or class to one single instance
        //E.g. often used in conjunction with the factory pattern
        ImageLoaderSingleton singletonInstance = ImageLoaderSingleton.getInstance();
        //ImageLoaderSingleton singleton = new ImageLoaderSingleton(); -> not allowed
        singletonInstance.printOut();
        singletonInstance = ImageLoaderSingleton.getInstance();
        singletonInstance.printOut();
    }

}
