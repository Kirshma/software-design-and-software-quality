package softwaredesign.designpatterns.abstractfactory;

public class ModernDocumentFactory extends DocumentFactory {

    private static ModernDocumentFactory documentFactory;

    private ModernDocumentFactory(){

    }

    public static ModernDocumentFactory getInstance() {
        if (documentFactory == null) {
            documentFactory = new ModernDocumentFactory();
        }
        return documentFactory;
    }

    @Override
    public Letter createLetter() {
        return new ModernLetter();
    }

    @Override
    public Resume createResume() {
        return new ModernResume();
    }
}
