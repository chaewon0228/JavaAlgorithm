package step2;
import java.util.Scanner;
public class CircleSL{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("수 입력 : ");
	int a = sc.nextInt();
	sc.close();
	
	double s, l;
	final double pi=3.14;
	
	if(a==1){
		s=13*13*pi;
		System.out.print("반지름 13인 원의 넓이 : "+s);
	}
	else if(a==2){
		l=17*2*pi;
		System.out.print("반지름 17인 원의 둘레 : "+l);
	}
	else if(a==3){
		s=4.5*4.5*pi;
		l=9*pi;
		System.out.println("지름 9인 원의 넓이 : "+s);
		System.out.println("지름 9인 원의 둘레 : "+l);
	}
	else System.out.println("수 입력 오류");
  }
}
