package step1;
import java.util.Scanner;
public class DoubleScan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0; 
		double sum=0; 
		System.out.print("실수 입력 개수 : ");
		int a = sc.nextInt();
		
		System.out.print("실수 입력 : ");
		for(int i=1; i<=a;i++) {
			double b = sc.nextDouble();
			cnt++;
			sum+=b;
			
		}
		sc.close();
		
		System.out.println("실수 합계 :"+sum);
		System.out.println("실수 평균 : "+(sum/cnt));
		

	}

}
