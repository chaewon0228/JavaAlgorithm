package step2;
import java.util.Scanner;
public class FourMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("4개의 정수 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt(); sc.close();
		
		int min;
		
		if(a<b && a<c && a<d) min = a;
		else if(b<c && b<d) min = b;
		else if(c<d) min = c;
		else min = d;
		
		System.out.println("최솟값 : "+min);
	}
}
