package softwarequality.dependencyinjectionWithGuice;

import com.google.inject.Inject;

public class DependentClass {

    private SomeClass someClass;

    @Inject
    public DependentClass(final @BindingAnnotations.SomeClass SomeClass someClass) {
        this.someClass = someClass;
    }

    public void printSomeClass() {
        System.out.println(someClass.toString());
    }

}
