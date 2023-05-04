package Day1.BT1;

public class hinhTron {
    private double canh = 1.0;

    public hinhTron() {}

    public hinhTron(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double chuvi(){
        return 2 * 3.14 * canh;
    }

    public double dienTich(){
        return 3.14 * canh * canh;
    }

    @Override
    public String toString() {
        return "hinhTron{" +
                "canh=" + canh +
                ",chuVi=" + chuvi() +
                ",DienTich=" + dienTich() +
                '}';
    }


}
