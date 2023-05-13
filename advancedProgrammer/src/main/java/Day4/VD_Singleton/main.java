package Day4.VD_Singleton;

public class main {
    public static void main(String[] args) {
        // Lấy phiên bản duy nhất của Singleton
        Singleton singleton = Singleton.getInstance();

        // Gọi phương thức showMessage
        singleton.showMessage();
    }
}
