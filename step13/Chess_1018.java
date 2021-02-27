package step13;
import java.util.Scanner;

public class Chess_1018 {
	public static boolean[][] a;
	public static int min = 64;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
 
		a = new boolean[n][m];
		sc.nextLine();
        for (int i=0; i<n; i++) {
			String str = sc.nextLine().trim();
			for (int j=0; j<m; j++) {
				if (str.charAt(j) == 'W') a[i][j] = true;		
				else a[i][j] = false;		
			}
		}
		int Nrow = n - 7;
		int Mcol = m - 7;
 
		for (int i=0; i<Nrow; i++) {
			for (int j=0; j<Mcol; j++) {
				color(i, j);
			}
		}
		System.out.println(min);
		sc.close();
	}
	public static void color(int x, int y) {
		int endX = x + 8;
		int endY = y + 8;
		int count = 0;
		boolean chess = a[x][y];	// Ã¹ Ä­ »ö 
 
		for (int i=x; i<endX; i++) {
			for (int j = y; j < endY; j++) { 
				if (a[i][j] != chess) count++; // ¿Ã¹Ù¸¥ »öX
				chess = (!chess); // ´ÙÀ½ Ä­ »öÀÌ ¹Ù²ñ
			}
			chess = !chess;
		}
		count = Math.min(count, 64-count);
		min = Math.min(min, count);
	}
}
