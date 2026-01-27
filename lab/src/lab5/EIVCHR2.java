package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class EIVCHR2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfItems = scanner.nextInt();
        long[] itemsCost = new long[numberOfItems];
        long totalMoney = 0;
        for (int i = 0; i < numberOfItems; i++) {
            itemsCost[i] = scanner.nextLong();
            totalMoney += itemsCost[i];
        }

        Arrays.sort(itemsCost);

        long maxDiscount = 50_000;
        long discount = (long) (itemsCost[numberOfItems - 1] * 0.3);
        long payment = 0;

        if (discount > maxDiscount) {
            payment = totalMoney - maxDiscount;
        } else {
            payment = totalMoney - discount;
        }

        System.out.println(payment);
    }
}
