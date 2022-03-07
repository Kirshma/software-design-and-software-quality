package softwarequality.dependencyinjectionWithGuice;


import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class DemoInjector extends AbstractModule {

    @Provides
    @BindingAnnotations.SomeClass
    static SomeClass provideSomeClass() {
        return new SomeClass();
    }

}
