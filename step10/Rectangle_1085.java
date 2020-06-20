package step10;
import java.util.Scanner;
public class Rectangle_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		System.out.println(Math.min(Math.min(w-x, x),Math.min(h-y, y)));
		
	}
}
