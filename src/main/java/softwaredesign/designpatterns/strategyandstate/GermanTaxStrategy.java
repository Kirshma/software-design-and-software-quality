package softwaredesign.designpatterns.strategyandstate;

public class GermanTaxStrategy implements TaxStrategy {

    @Override
    public int calculateTax() {
        return 19;
    }


}
