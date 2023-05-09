package Day3.BTVN.BT1;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dong vat");
        System.out.println(animal.toString());
        Mammal mammal = new Mammal("Dong vat co vu");
        System.out.println(mammal.toString());
        Dog dog = new Dog("Dog 1");
        System.out.println(dog.toString());
        Cat cat = new Cat("Cat 1");
        System.out.println(cat.toString());

    }
}
