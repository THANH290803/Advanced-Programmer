package Day2.BaiMoi.KeThua;

public class main {
    public static void main(String[] args) {
        KeToan kt1 = new KeToan("KT1", "Kết Toán 1");
//        System.out.println(kt1);

        IT it1 = new IT("IT1", "Nhan vien IT1");
//        System.out.println(it1);

        NhanVien arr[] = new NhanVien[3];
        arr[0] = kt1;
        arr[1] = it1;
        arr[2] = new IT("IT2", "IT2");

        // Duyet va in thong tin
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }

}
