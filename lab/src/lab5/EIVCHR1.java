package lab5;

import java.util.Scanner;

public class EIVCHR1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long itemsCost = scanner.nextLong();
        long maxDiscount = 50_000;
        long discount = (long) (itemsCost * 0.3);
        long payment = 0;
        if (discount > maxDiscount) {
            payment = itemsCost - maxDiscount;
        } else {
            payment = itemsCost - discount;
        }

        System.out.println(payment);
    }
}
