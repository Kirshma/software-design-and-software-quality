package softwaredesign.designpatterns.strategyandstate;

public class TaxCalculator {

    private TaxStrategy taxStrategy;

    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public int calculateTax() {
        return taxStrategy.calculateTax();
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }
}
