package lab4;

import java.util.Scanner;

public class EIUBHOUSE {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double houseCost = scanner.nextDouble();
        double baseMoney = scanner.nextDouble();
        int months = scanner.nextInt();
        double interestRate = scanner.nextDouble() / 100;

        //Số tiền cần mượn để mua nhà 
        double loan = houseCost - baseMoney;

        double moneyPerMonth = loan / months;
        double payment;

        for (int month = 1; month <= months; month++) {

            //Số tiền cần trả mỗi tháng: 
            //tiền gốc + tiền lãi của phần chưa trả
            payment = moneyPerMonth + loan * interestRate;

            loan -= moneyPerMonth;

            System.out.println(month + " " + Math.round(payment));
        }
    }
}
