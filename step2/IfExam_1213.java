package step2;
import java.util.Scanner;
public class IfExam_1213 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� :  ");
		int a=sc.nextInt();
	  	
		System.out.print("�ι�° ���� �Է� :  ");
	  	int b=sc.nextInt();
	  	
		System.out.println("���� 1 : "+a);
	  	System.out.println("���� 2 : "+b);
	  
	  	if(a>0 && b>0){
	 		System.out.print("����° ���� �Է� :  ");
			int c = sc.nextInt(); 
			System.out.println(a+" + "+b+" - "+c+" = "+(a+b-c));
		}
	 	else {
			System.out.println("ERROR �߻�" );
	  	}
	  sc.close();
  }
}
