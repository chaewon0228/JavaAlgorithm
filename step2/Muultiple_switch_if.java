package step2;
import java.util.Scanner;
public class Muultiple_switch_if {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int number = sc.nextInt();
		sc.close();
		switch(number % 3){
			case 0 : System.out.println(number + "�� 3�� ����̴�."); break;
			default : switch(number % 5){
				 case 0 : System.out.println(number + "�� 5�� ����̴�."); break;
				 default : switch(number % 8){		
					  case 0 : System.out.println(number+"�� 8�� ����̴�."); break;
					  default : System.out.println("��� ����� �ƴϴ�.");
	                         		 
	         		           }                  
	             }      
	  }
	}
}
