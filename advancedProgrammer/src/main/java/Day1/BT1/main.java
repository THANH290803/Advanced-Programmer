package Day1.BT1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        hinhTron hinhTron1 =new hinhTron();
        hinhTron hinhTron2 =new hinhTron(2);
        System.out.println(hinhTron1);
        System.out.println(hinhTron2);

        hinhTron arr[] = new hinhTron[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.printf("r[%d]=", i);
            double r = Double.parseDouble(in.nextLine());
            arr[i] = new hinhTron(r);
        }
        for (int i =0; i < 5; i++){
            System.out.println(arr[i].toString());
        }

        hinhTron hinhTronMax = arr[0];
        for (int i =0; i < 5; i++){
            if(hinhTronMax.chuvi() < arr[i].chuvi()){
                hinhTronMax = arr[i];
            }
        }
        System.out.println("Hinh co chu vi lon nhat la: ");
        System.out.println(hinhTronMax);

    }
}
