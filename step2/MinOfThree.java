package step2;
import java.util.Scanner;
public class MinOfThree {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Min;
		
		System.out.print( "ù ��° �� �Է� : ");
		int num1= sc.nextInt();
		System.out.print( "�� ��° ���Է� : ");
		int num2= sc.nextInt();
		System.out.print( "�� ��° ���Է� : ");
		int num3= sc.nextInt();
	    	sc.close();
		System.out.print(num1+"�� "+num2+"�� "+num3+" �� ���� ���� ���� ");
		
		if(num1<num2 ) {
			if(num1<num3) Min = num1;
			else Min = num3;
		}
		else if(num2<num3 ) Min =num2;
		else Min = num3;
			
		System.out.println(Min + "�Դϴ�.");
	  }
}
