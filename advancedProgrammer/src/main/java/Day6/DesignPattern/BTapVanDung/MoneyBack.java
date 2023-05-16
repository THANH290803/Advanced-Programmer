package Day6.DesignPattern.BTapVanDung;

public class MoneyBack implements CreditCard{
    @Override
    public String getCartType() {
        return "Money Back";
    }

    @Override
    public int getCreditLimit() {
        return 100000000;
    }

    @Override
    public int getAnnualCharge() {
        return 9000;
    }
}
