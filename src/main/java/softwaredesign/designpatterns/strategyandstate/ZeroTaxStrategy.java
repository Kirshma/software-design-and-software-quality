package softwaredesign.designpatterns.strategyandstate;

public class ZeroTaxStrategy implements TaxStrategy{


    @Override
    public int calculateTax() {
        return 0;
    }


}
