package Day8.BT1;

public class HinhTron implements IHinhHoc{

    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return Math.PI * banKinh * 2;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron[" +
                "banKinh=" + banKinh +
                ']';
    }
}
