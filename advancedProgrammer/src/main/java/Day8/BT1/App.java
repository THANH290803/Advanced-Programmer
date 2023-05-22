package Day8.BT1;

public class App {
    public static void main(String[] args) {
        HinhVuong hinhVuong = new HinhVuong(4);
        HinhTron hinhTron = new HinhTron(4);

        Drawable drawable = new Drawable();
        drawable.draw(hinhVuong);
        drawable.draw(hinhTron);
    }
}
