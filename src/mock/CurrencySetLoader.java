package mock;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements persistence.CurrencySetLoader{
    private final CurrencySet currencySet;
    
    public CurrencySetLoader() {
        currencySet = new CurrencySet();
    }
    
    @Override
    public CurrencySet load() {
        currencySet.add(new Currency("EUR","Euro","€"));
        currencySet.add(new Currency("USD", "United States Dollar", "$"));
        currencySet.add(new Currency("AUS", "Australian Dollar", "$"));
        currencySet.add(new Currency("GBP", "Libras", "£"));
        currencySet.add(new Currency("ARS", "Pesos Argentino", "$"));
        currencySet.add(new Currency("CHF", "Swiss Franc", "CHF"));
        return currencySet;
    }
}
