package Day6.BTapLienQuan.BT1;

public class DenDa implements phaCafe{
    private String loaiCafe = "hạt rang Arabica Cầu Đất.";

    private int apSuat = 4;
    private String nuoc = "50ml";

    private int doC = 50;

    private DenDa() {
    }

    @Override
    public void phaCafe() {
        System.out.println("Đen đá: " + loaiCafe);
        System.out.println("Áp suất: " + apSuat + " Pa");
        System.out.println("Nước: " + nuoc);
        System.out.println("Độ C: " + doC);
        System.out.println("Đang pha đen đá...");
        System.out.println("Đen đá đã được pha xong.");
    }
}
