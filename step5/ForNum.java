package step5;
import java.util.Scanner;
public class ForNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1000; i>=1; i/=10) {
			System.out.println(i+"�� �ڸ� : "+(a/i)%10);
		}
	}
}
