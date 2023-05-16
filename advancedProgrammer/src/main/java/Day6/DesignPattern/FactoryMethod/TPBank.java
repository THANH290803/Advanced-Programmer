package Day6.DesignPattern.FactoryMethod;

public class TPBank implements Bank{
    @Override
    public String getBankName() {
        return "TPBank";
    }

    @Override
    public void payment() {
        System.out.println("Trien khai rieng cua TPBank");
    }
}
