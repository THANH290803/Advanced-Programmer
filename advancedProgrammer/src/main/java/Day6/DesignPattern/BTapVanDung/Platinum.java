package Day6.DesignPattern.BTapVanDung;

import java.text.DecimalFormat;

public class Platinum implements CreditCard{
    @Override
    public String getCartType() {
        return "Platinum";
    }

    @Override
    public int getCreditLimit() {
        return 150000000;
    }

    @Override
    public int getAnnualCharge() {
        return 12000;
    }
}
