package step9;
import java.util.Scanner;
public class Apartment_2775 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
 
        for (int i = 0; i < num; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(a(k, n));
        }
        sc.close();
    }
     private static int a(int k, int n) {
        if (n == 0)
            return 0;
        else if (k == 0)
            return n;
        else {
            return a(k, n - 1) + a(k - 1, n);
        }
    }
}
