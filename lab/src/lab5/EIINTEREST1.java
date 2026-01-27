package lab5;

import java.util.Scanner;

public class EIINTEREST1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double monthlyBankRate = scanner.nextDouble();
        int months = 12;
        double finalMoney = 0;

        for (int i = 0; i < months; i++) {
            double money = scanner.nextDouble();
            finalMoney += money * Math.pow(1 + monthlyBankRate, months - i);
        }

        System.out.println(Math.round(finalMoney));
    }

}
