
import java.util.Scanner;

public class EIMONE {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int money = sc.nextInt();
        int[] bankNotes = new int[]{20, 10, 5, 1};
        for (int i = 0; i < bankNotes.length; i++) {
            if (money >= bankNotes[i]) {
                System.out.println(bankNotes[i] + " " + money / bankNotes[i]);
                money = money % bankNotes[i];
            }
        }
    }
}
