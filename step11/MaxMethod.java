package step11;
import java.util.Scanner;
public class MaxMethod {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max;
		System.out.print( "ù ��° �� �Է� : ");
		int a=sc.nextInt();
		System.out.print( "�� ��° �� �Է� : ");
		int b=sc.nextInt();
		sc.close();
	    max = getMax(a, b);
		System.out.println(a + "�� "+b+" �� ū ���� "+max+"�Դϴ�.");
	  }
	  static int getMax(int a, int b){
		int max;
		if(a>b) max=a;
		else max=b;
		return max;
	  }
}
