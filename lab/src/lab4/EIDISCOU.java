
import java.util.Scanner;

public class EIDISCOU {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double N = sc.nextDouble();
        double totalDiscount = 0;
        double[] money = new double[]{2_000_000, 10_000_000, 50_000_000, 100_000_000, 200_000_000, 500_000_000};
        double[] discountRate = new double[]{0.03, 0.05, 0.07, 0.1, 0.12, 0.15};
        for (int i = 0; i < discountRate.length; i++) {
            if (N > money[i]) {
                if (N > money[i + 1]) {
                    totalDiscount += (money[i + 1] - money[i]) * discountRate[i];
                } else {
                    totalDiscount += (N - money[i]) * discountRate[i];
                }
            }
        }
        System.out.println(Math.round(N - totalDiscount));
    }
}
