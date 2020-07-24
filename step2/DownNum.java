package step2;
import java.util.Scanner;
public class DownNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력(3개) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x>y) {
			if(x>z) {
				if(y>z) System.out.println(z+" "+y+" "+z);
				else System.out.println(y+" "+z+" "+x);
			}
			else System.out.println(z+" "+z+" "+y);
		}
		else {
			if(y>z) {
				if(x>z) System.out.println(y+" "+x+" "+z);
				else System.out.println(y+" "+z+" "+x);
			}
			else System.out.println(z+" "+y+" "+x);
		}
		sc.close();
		
		
	}
}
