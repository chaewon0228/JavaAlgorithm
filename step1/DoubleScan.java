package step1;
import java.util.Scanner;
public class DoubleScan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0; 
		double sum=0; 
		System.out.print("�Ǽ� �Է� ���� : ");
		int a = sc.nextInt();
		
		System.out.print("�Ǽ� �Է� : ");
		for(int i=1; i<=a;i++) {
			double b = sc.nextDouble();
			cnt++;
			sum+=b;
			
		}
		sc.close();
		
		System.out.println("�Ǽ� �հ� :"+sum);
		System.out.println("�Ǽ� ��� : "+(sum/cnt));
		

	}

}
