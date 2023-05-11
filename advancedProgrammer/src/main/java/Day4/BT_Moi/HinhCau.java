package Day4.BT_Moi;

public class HinhCau implements IHinhHoc3D{

    private double banKinh;

    private String mauSac;

    public HinhCau(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhCau(String mauSac) {
        this.mauSac = mauSac;
    }

    public HinhCau(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    @Override
    public double TheTich() {
        return Math.PI * banKinh;
    }
}
