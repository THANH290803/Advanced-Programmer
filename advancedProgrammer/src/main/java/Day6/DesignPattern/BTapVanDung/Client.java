package Day6.DesignPattern.BTapVanDung;

import java.text.DecimalFormat;

public class Client {
    public static void main(String[] args) {
        CreditCard card = CardFactory.getCard(CardType.PLATINUM);

        if (card != null){
            System.out.println("Cart Type: " + card.getCartType());
            DecimalFormat decimalFormat = new DecimalFormat("###,###.###");
            int creditLimit = card.getCreditLimit();
            int annualCharge = card.getAnnualCharge();
            System.out.println("Credit Limit: " + decimalFormat.format(creditLimit));
            System.out.println("Annual Charge: " + decimalFormat.format(annualCharge));
        }
    }
}
