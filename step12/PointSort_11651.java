package step12;
import java.util.Scanner;
import java.util.Arrays;
 
public class PointSort_11651 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		
		for(int i=0; i<n; i++) {
			a[i][1] = sc.nextInt();
			a[i][0] = sc.nextInt();
		}
		Arrays.sort(a, (e, e2) -> {
			if(e[0] == e2[0]) return e[1] - e2[1];
			else return e[0] - e2[0];
		});
		
        for(int i=0; i<n; i++) {
			System.out.println(a[i][1]+" "+a[i][0]);
		}
        sc.close();
	}
}
