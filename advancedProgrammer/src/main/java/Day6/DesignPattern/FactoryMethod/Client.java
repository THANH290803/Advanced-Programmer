package Day6.DesignPattern.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank("TPBank");
        if (bank != null){
            System.out.println(bank.getBankName());
            bank.payment();
        }
    }
}
