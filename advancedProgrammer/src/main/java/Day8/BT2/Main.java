package Day8.BT2;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(4,8);
        PhanSo ps2 = new PhanSo(5,6);
        PhanSo ps3 = new PhanSo(2,5);

        ITinhToan<PhanSo> tinhToan = new TinhToanPhanSo();
        PhanSo tong = tinhToan.cong(ps1, ps2, ps3);
        PhanSo tich = tinhToan.nhan(ps1, ps2, ps3);
        System.out.println(tong);
        System.out.println(tich);
    }
}
