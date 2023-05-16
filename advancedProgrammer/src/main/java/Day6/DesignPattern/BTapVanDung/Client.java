package Day6.DesignPattern.BTapVanDung;

import java.text.DecimalFormat;

public class Client {
    public static void main(String[] args) {
        CreditCard card = CardFactory.getCard("Titanium");

        if (card != null){
            System.out.println(card.getCartType());
            DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
            int creditLimit = card.getCreditLimit();
            int annualCharge = card.getAnnualCharge();
            System.out.println(decimalFormat.format(creditLimit));
            System.out.println(decimalFormat.format(annualCharge));
        }
    }
}