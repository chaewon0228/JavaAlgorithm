package step2;
import java.util.Scanner;
public class Multiple_switch {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//char grade; 
		System.out.print("국어 점수 : " );
		int a = sc.nextInt();
		System.out.print("영어 점수 : " );
		int b = sc.nextInt();	
		System.out.print("JAVA 점수 : " );
	             int c = sc.nextInt();
		sc.close();
		double avg = (double)(a+b+c)/3;
		System.out.println("총점 : " + (a + b + c));
		System.out.println("평균 : " + avg);
		System.out.println("평점 : "+ Grade(avg));
		
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
