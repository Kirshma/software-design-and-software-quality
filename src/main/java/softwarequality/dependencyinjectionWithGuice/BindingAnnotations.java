package softwarequality.dependencyinjectionWithGuice;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class BindingAnnotations {

    @Qualifier
    @Retention(RUNTIME)
    @interface SomeClass {}
}
