package Day6.DesignPattern.FactoryMethod;

public class BankFactory {

    private BankFactory(){}

    public static Bank getBank(String bank){
        switch (bank){
            case "Vietcombank":
                return new Vietcombank();
            case "Viettinbank":
                return new Viettinbank();
            case "TPBank":
                return new TPBank();
            default:
                return null;
        }
    }
}
