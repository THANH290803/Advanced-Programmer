package Day6.DesignPattern.BTapVanDung;

public class CardFactory {

    private CardFactory(){};

    public static CreditCard getCard(CardType card){
        switch (card){
            case MONEY_BACK:
                return new MoneyBack();
            case PLATINUM:
                return new Platinum();
            case TITANIUM:
                return new Titanium();
            default:
                return null;
        }
    }
}
