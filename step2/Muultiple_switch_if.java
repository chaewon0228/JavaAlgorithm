package step2;
import java.util.Scanner;
public class Muultiple_switch_if {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int number = sc.nextInt();
		sc.close();
		
		switch(number % 3){
			case 0 : System.out.println(number + "은 3의 배수이다."); break;
			default : switch(number % 5){
				 case 0 : System.out.println(number + "은 5의 배수이다."); break;
				 default : switch(number % 8){		
					  case 0 : System.out.println(number+"은 8의 배수이다."); break;
					  default : System.out.println("어느 배수도 아니다.");
	                         }                  
	                }      
		}
	}
}
