package step2;
import java.util.Scanner;
public class Test1213_1{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int sum=0;

	System.out.print("짝수 계산(E, e), 홀수 계산(O, o) 선택 : ");
	char a = sc.next().charAt(0);

	if( a == 'O' || a == 'o' ){
		System.out.print("임의의 양수 입력 : ");
		int b = sc.nextInt();
		
		for(int i=1; i<=b; i+=2) sum+=i; 
		System.out.println("1~"+b+"까지의 홀수의 합은 "+sum+"입니다.");
	}
	else if( a == 'E' || a == 'e' ){
		System.out.print("임의의 양수 입력 : ");
		int b = sc.nextInt();
		
		for(int i=2; i<=b; i+=2) sum+=i;
		System.out.println("1~"+b+"까지의 짝수의 합은 "+sum+"입니다.");
	}
	else System.out.println("선택 오류 발생");
	sc.close();
  }
}
