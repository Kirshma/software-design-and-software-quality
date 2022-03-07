package softwaredesign.designpatterns.abstractfactory;

public class FancyDocumentFactory extends DocumentFactory{

    private static FancyDocumentFactory documentFactory;

    private FancyDocumentFactory(){

    }

    public static FancyDocumentFactory getInstance() {
        if (documentFactory == null) {
            documentFactory = new FancyDocumentFactory();
        }
        return documentFactory;
    }

    @Override
    public Letter createLetter() {
        return new FancyLetter();
    }

    @Override
    public Resume createResume() {
        return new FancyResume();
    }
}
