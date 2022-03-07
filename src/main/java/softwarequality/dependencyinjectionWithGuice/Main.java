package softwarequality.dependencyinjectionWithGuice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * https://github.com/google/guice/wiki/GettingStarted
 */
public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(
                new DemoInjector());
        DependentClass dependentClass = injector.getInstance(DependentClass.class);
        dependentClass.printSomeClass();
    }

}
