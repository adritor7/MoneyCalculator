package mock;

import java.util.ArrayList;
import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader implements persistence.ExchangeRateLoader {
    ArrayList<String> currency;
    ArrayList<Double> rate;
    
    @Override
    public ExchangeRate load(Currency from, Currency to) {
        setExchangeRate();
        return new ExchangeRate(from,to,calculateRate(from,to));
    }

    private void setExchangeRate() {
        addCurrency();
        addRate();
    }

    private void addCurrency() {
        currency = new ArrayList<>();
        currency.add("ARS");
        currency.add("AUS");
        currency.add("CHF");
        currency.add("EUR");
        currency.add("GBP");
        currency.add("USD");
    }

    private void addRate() {
        rate = new ArrayList<>();
        rate.add(9.93);
        rate.add(1.46328341);
        rate.add(7.5);
        rate.add(1.0);
        rate.add(0.762866);
        rate.add(1.15498);
        
    }

    public double calculateRate(Currency from, Currency to) {
        return (1/rate.get(currency.indexOf(from.getCode()))) * rate.get(currency.indexOf(to.getCode()));
    }
    
}
