package Day6.DesignPattern.BTapVanDung;

import java.text.DecimalFormat;

public class Titanium implements CreditCard{
    @Override
    public String getCartType() {
        return "Titanium";
    }

    @Override
    public int getCreditLimit() {
        return 200000000;
    }

    @Override
    public int getAnnualCharge() {
        return 20000;
    }
}
