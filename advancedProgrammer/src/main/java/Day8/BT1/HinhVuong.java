package Day8.BT1;

public class HinhVuong implements IHinhHoc{

    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double chuVi() {
        return canh * 4;
    }

    @Override
    public double dienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "HinhVuong[" +
                "canh=" + canh +
                ']';
    }
}
