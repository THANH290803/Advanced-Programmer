package Day6.DesignPattern.FactoryMethod;

public class Vietcombank implements Bank{
    @Override
    public String getBankName() {
        return "Vietcombank";
    }

    @Override
    public void payment() {
        System.out.println("Trien khai rieng cua Vietcombank");
    }
}
