package step12;
import java.util.Scanner;
public class ArraySort_1427 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[10];
        
        while(n != 0){
            cnt[n % 10]++;
            n /= 10;
        }
        for (int i=9; i>=0; i--) {
			while (cnt[i]-- > 0) {
				System.out.print(i);
			}
		}
        sc.close();
    }
}