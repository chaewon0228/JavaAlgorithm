package step2;
import java.util.Scanner;
public class IfExam_1213 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 :  ");
		int a=sc.nextInt();
	  	
		System.out.print("두번째 정수 입력 :  ");
	  	int b=sc.nextInt();
	  	
		System.out.println("정수 1 : "+a);
	  	System.out.println("정수 2 : "+b);
	  
	  	if(a>0 && b>0){
	 		System.out.print("세번째 정수 입력 :  ");
			int c = sc.nextInt(); 
			System.out.println(a+" + "+b+" - "+c+" = "+(a+b-c));
		}
	 	else {
			System.out.println("ERROR 발생" );
	  	}
	  sc.close();
  }
}
