
import java.util.Scanner;

public class EIEVERYN {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            boolean[] check = new boolean[n + 1];
            for (int i = 0; i < m; i++) {
                int ai = sc.nextInt();
                if (ai >= 1 && ai <= n) {
                    check[ai] = true;
                }
            }
            boolean flag = true;
            for (int j = 1; j <= n; j++) {
                if (check[j] == false) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Yes"); 
            }else {
                System.out.println("No");
            }
            T -= 1;
        }
    }
}
