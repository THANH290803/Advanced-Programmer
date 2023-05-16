package Day6.DesignPattern.BTapVanDung;

public class CardFactory {

    private CardFactory(){};

    public static CreditCard getCard(String card){
        switch (card){
            case "MoneyBack":
                return new MoneyBack();
            case "Platinum":
                return new Platinum();
            case "Titanium":
                return new Titanium();
            default:
                return null;
        }
    }
}
