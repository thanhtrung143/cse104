package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class EIVCHR3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfItems = scanner.nextInt();
        int numberOfVouchers = scanner.nextInt();

        long[] itemsCost = new long[numberOfItems];
        long totalMoney = 0;

        for (int i = 0; i < numberOfItems; i++) {
            itemsCost[i] = scanner.nextLong();
            totalMoney += itemsCost[i];
        }

        Arrays.sort(itemsCost);
        
        long totalDiscount = 0;
        for (int i = itemsCost.length - 1; i >= 0; i--) {
            totalDiscount += calDiscount(itemsCost[i]);

            numberOfVouchers--;
            if (numberOfVouchers == 0) {
                break;
            }
        }

        System.out.println(totalMoney - totalDiscount);
    }

    static long calDiscount(long itemCost) {
        final long DISCOUNT_RATE = 30;
        final long MAX_DISCOUNT = 50_000;

        long discount = itemCost * DISCOUNT_RATE / 100;

        if (discount > MAX_DISCOUNT) {
            discount = MAX_DISCOUNT;
        }

        return discount;
    }
}
