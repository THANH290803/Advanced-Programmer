package Day2.On_Lai_Bai_Cu.BT2;

public class HinhChuNhat {
    private double chieuDai = 1.0;

    private double chieuRong = 1.0;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0){
            throw new RuntimeException("Gia tri phai duong");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai <= 0){
            throw new RuntimeException("Canh phai duong");
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong <= 0){
            throw new RuntimeException("Canh phai duong");
        }
        this.chieuRong = chieuRong;
    }

    public double chuVi(){
        return (chieuDai + chieuRong) * 2;
    }

    public double dienTich(){
        return chieuDai * chieuRong;
    }
}
