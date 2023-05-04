package Day2.On_Lai_Bai_Cu.BT3;

public class HinhThangCan {
    private double dayLon;
    private double dayNho;
    private double chieuCao;



    public HinhThangCan(double dayLon, double dayNho, double chieuCao) {
        if (dayLon <= 0 || dayNho <= 0 || chieuCao <= 0){
            throw new RuntimeException("Canh phai la so duong");
        }
        this.dayLon = dayLon;
        this.dayNho = dayNho;
        this.chieuCao = chieuCao;
    }

    public double getDayLon() {
        return dayLon;
    }

    public void setDayLon(double dayLon) {
        if (dayLon <= 0){
            throw new RuntimeException("Canh phai la so duong");
        }
        this.dayLon = dayLon;
    }

    public double getDayNho() {
        return dayNho;
    }

    public void setDayNho(double dayNho) {
        if (dayNho <= 0){
            throw new RuntimeException("Canh phai la so duong");
        }
        this.dayNho = dayNho;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        if (chieuCao <= 0){
            throw new RuntimeException("Canh phai la so duong");
        }
        this.chieuCao = chieuCao;
    }

    public double tinhChuVi() {
        double tmp = (dayLon - dayNho) / 2;
        double canhBen = Math.sqrt(tmp * tmp + chieuCao * chieuCao);
        return (dayLon + dayNho + canhBen * 2);
    }

    public double tinhDienTich() {
        return (dayLon + dayNho) * chieuCao / 2;
    }

    @Override
    public String toString() {
        return "HinhThangCan{" +
                "dayLon=" + dayLon +
                ", dayNho=" + dayNho +
                ", chieuCao=" + chieuCao +
                ", chuVi=" + Math.round(tinhChuVi() * 100.0) / 100.0 +
                ", dienTich=" + tinhDienTich() +
                '}';
    }
}
