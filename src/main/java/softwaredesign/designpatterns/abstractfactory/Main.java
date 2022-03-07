package softwaredesign.designpatterns.abstractfactory;

public class Main {

    public static void main(String[] args) {
        /* Factory Pattern */
        //Decouple usage and creation of objects, group factories by "product families" and abstract them
        DocumentFactory documentFactory = FancyDocumentFactory.getInstance(); //Single point to switch the "product family"; also a Singleton
        documentFactory.createLetter(); //Returns a FancyLetter instance due to setting the concrete factory to it above
        documentFactory.createResume(); //Returns a FancyResume
        documentFactory = ModernDocumentFactory.getInstance(); //Single point to switch the "product family"; Now to ModernDocuments instead of FancyDocuments
        documentFactory.createResume(); //Returns a ModernResume
    }

}
