package step10;
import java.util.Scanner;
public class Dicimal3_1929 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int i, j, m = sc.nextInt(), n = sc.nextInt();
	        int a[] = new int[n+1];
		sc.close();
			
	        for (i=0; i<=n; i++) a[i] = 0;
		a[1] = 1;
			
		for (i=2; i<=n; i++) {
			for (j=2; i*j <= n; j++) {
				a[i*j] = 1;
			}
		}
		for (i=m; i<=n; i++) if(a[i] != 1) System.out.println(i);
			
	    }
}
