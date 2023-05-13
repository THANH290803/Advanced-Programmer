package Day4.VD_Singleton;

public class Singleton {
    private static Singleton instance;

    // private constructor để ngăn chặn việc khởi tạo từ bên ngoài
    private Singleton() {
    }

    // phương thức tạo hoặc trả về phiên bản duy nhất của Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
