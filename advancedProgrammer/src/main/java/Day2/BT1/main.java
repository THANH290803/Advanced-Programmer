package Day2.BT1;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("BKC123", "NGUYEN VAN A", 8.0);
        s1.setId("Bkc123");
        s1.setName("NGUYEN VAN B");
        s1.setMark(8.0);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
