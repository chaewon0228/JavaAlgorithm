package step2;
import java.util.Scanner;
public class Test1213_1{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int sum=0;

	System.out.print("¦�� ���(E, e), Ȧ�� ���(O, o) ���� : ");
	char a = sc.next().charAt(0);

	if( a == 'O' || a == 'o' ){
		System.out.print("������ ��� �Է� : ");
		int b = sc.nextInt();
		
		for(int i=1; i<=b; i+=2) sum+=i; 
		System.out.println("1~"+b+"������ Ȧ���� ���� "+sum+"�Դϴ�.");
	}
	else if( a == 'E' || a == 'e' ){
		System.out.print("������ ��� �Է� : ");
		int b = sc.nextInt();
		
		for(int i=2; i<=b; i+=2) sum+=i;
		System.out.println("1~"+b+"������ ¦���� ���� "+sum+"�Դϴ�.");
	}
	else System.out.println("���� ���� �߻�");
	sc.close();
  }
}
