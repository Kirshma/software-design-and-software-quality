package softwaredesign.designpatterns.singleton;

public class ImageLoaderSingleton {

    private static ImageLoaderSingleton singletonInstance;
    private final String string;

    private ImageLoaderSingleton(String something) {
        this.string = something;
    }

    public static ImageLoaderSingleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new ImageLoaderSingleton("This is the only instance");
        }
        return singletonInstance;
    }

    public void printOut() {
        System.out.println(string);
    }

}
