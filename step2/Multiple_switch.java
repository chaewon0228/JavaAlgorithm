package step2;
import java.util.Scanner;
public class Multiple_switch {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//char grade; 
		System.out.print("���� ���� : " );
		int a = sc.nextInt();
		System.out.print("���� ���� : " );
		int b = sc.nextInt();	
		System.out.print("JAVA ���� : " );
	             int c = sc.nextInt();
		sc.close();
		double avg = (double)(a+b+c)/3;
		System.out.println("���� : " + (a + b + c));
		System.out.println("��� : " + avg);
		System.out.println("���� : "+ Grade(avg));
		
	  }
	  static char Grade(double n){
		char grade;
		
		switch((int)(n/10)){
			case 10 :
			case 9 : grade = 'A'; break;
			case 8 : grade = 'B'; break;
			case 7 : grade ='C'; break;
			case 6 : grade = 'D'; break;
			default : grade = 'E';
		}
		return grade;
	  }
}
