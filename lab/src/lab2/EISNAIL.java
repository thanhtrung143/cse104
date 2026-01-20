
import java.util.Scanner;

public class EISNAIL {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();

        long day = (long) (1 + Math.ceil((double) (V - A) / (A - B)));
        System.out.println(day);
    }
}
