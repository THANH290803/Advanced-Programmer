package Day6.BTapLienQuan.BT1;

public class Espresso implements phaCafe{

    private String loaiCafe = "hạt Espresso";

    private int apSuat = 5;
    private String nuoc = "25ml";

    private int doC = 20;

    private Espresso(String loaiCafe, int apSuat, String nuoc, int doC) {
        this.loaiCafe = loaiCafe;
        this.apSuat = apSuat;
        this.nuoc = nuoc;
        this.doC = doC;
    }

    public String getLoaiCafe() {
        return loaiCafe;
    }

    public void setLoaiCafe(String loaiCafe) {
        this.loaiCafe = loaiCafe;
    }

    public int getApSuat() {
        return apSuat;
    }

    public void setApSuat(int apSuat) {
        this.apSuat = apSuat;
    }

    public String getNuoc() {
        return nuoc;
    }

    public void setNuoc(String nuoc) {
        this.nuoc = nuoc;
    }

    public int getDoC() {
        return doC;
    }

    public void setDoC(int doC) {
        this.doC = doC;
    }

    private Espresso() {
    }


    @Override
    public void phaCafe() {
        System.out.println("Espresso: " + loaiCafe);
        System.out.println("Áp suất: " + apSuat + " Pa");
        System.out.println("Nước: " + nuoc);
        System.out.println("Độ C: " + doC);
        System.out.println("Đang pha espresso...");
        System.out.println("Espresso đã được pha xong.");
    }
}
