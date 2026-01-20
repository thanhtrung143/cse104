
import java.util.Scanner;

public class EIUCHRMS {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        long[] bill = new long[n];
        for (int i = 0; i < n; i++) {
            bill[i] = scanner.nextLong();
        }
        double[] money = new double[]{0, 2_000_000, 5_000_000, 10_000_000, 20_000_000, 50_000_000, 100_000_000, 200_000_000};
        double[] discountRate = new double[]{0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09, 0.1};
        double totalMoney = 0;
        for (int i = 0; i < n; i++) {
            for (int j = discountRate.length - 1; j >= 0; j--) {
                if (bill[i] > money[j]) {
                    totalMoney += bill[i] * (1 - discountRate[j]);
                    break;
                }
            }
        }
        System.out.println(Math.round(totalMoney));
    }
}
