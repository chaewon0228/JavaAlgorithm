package step10;
import java.util.Scanner;
public class DicimalSumMinimum_2581 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j;
        int n = sc.nextInt(); int m = sc.nextInt();
        sc.close();
        int sum = 0; int minimum = 0;
        
        for(i=m; i >= n; i--){
            for(j=2; j<i; j++) if(i % j == 0) break;
            if(j == i){
                sum += i;
                minimum = j;
            }
        }
        System.out.println(sum == 0 ? -1 : sum + "\n" + minimum );
    }
}
