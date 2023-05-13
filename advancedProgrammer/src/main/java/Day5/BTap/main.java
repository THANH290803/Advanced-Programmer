package Day5.BTap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Order order = new Order.Builder()
                .setTraDa(true)
                .setBanhMyThapCam20k(2)
                .setPho(true)
                .setBun(false)
                .setCoca(true)
                .setCafe(false)
                .setXoi(false)
                .setKem(false)
                .setTraSua(true)
                .setChao(true)
                .create();

        System.out.println(order);
    }
}
