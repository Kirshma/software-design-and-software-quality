package softwaredesign.designpatterns.strategyandstate;

public class Main {

    public static void main(String[] args) {
        /* Strategy Pattern
        If many variations of an algorithm exist where the client decides which one will be used,
        the strategy pattern can be of help to encapsulate the variants as an object
        In contrast to the state pattern the client has to know about all the possible strategies
        E.g. an algorithm for formatting a text in different styles
         */
        TaxCalculator taxCalculator = new TaxCalculator(new GermanTaxStrategy());
        taxCalculator.calculateTax(); //Calculates german tax
        taxCalculator.setTaxStrategy(new ZeroTaxStrategy());
        taxCalculator.calculateTax(); //Zero tax
    }



}
