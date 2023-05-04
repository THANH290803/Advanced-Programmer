package Day2.On_Lai_Bai_Cu.BT2;

public class main {
    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat();
        System.out.println("Chu vi hinh chu nhat la: " + h1.chuVi());
        h1.setChieuDai(2);
        System.out.println("Chu vi hinh chu nhat la: " + h1.chuVi());
        HinhChuNhat h2 = new HinhChuNhat();
        System.out.println("Dien tich hinh chu nhat la: " + h2.dienTich());
    }
}
