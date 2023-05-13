package Day5.BTap;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Order order = new Order.Builder()
                .setTraDa(1)
                .setBanhMyThapCam20k(2)
                .setPho(2)
                .setBun(2)
                .setCoca(3)
                .setCafe(2)
                .setXoi(1)
                .setKem(0)
                .setTraSua(1)
                .setChao(1)
                .create();

        order.printOrder();
    }
}
