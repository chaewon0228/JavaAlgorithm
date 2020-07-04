package step2;
import java.util.Scanner;
public class MinOfThree {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Min;
		
		System.out.print( "첫 번째 수 입력 : ");
		int num1= sc.nextInt();
		System.out.print( "두 번째 수입력 : ");
		int num2= sc.nextInt();
		System.out.print( "세 번째 수입력 : ");
		int num3= sc.nextInt();
	    	sc.close();
		System.out.print(num1+"와 "+num2+"와 "+num3+" 중 제일 작은 수는 ");
		
		if(num1<num2 ) {
			if(num1<num3) Min = num1;
			else Min = num3;
		}
		else if(num2<num3 ) Min =num2;
		else Min = num3;
			
		System.out.println(Min + "입니다.");
	  }
}
