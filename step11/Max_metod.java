package step11;
import java.util.Scanner;
public class Max_metod{
   public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int max;
	System.out.print( "ù ��° �� �Է� : ");
	int a=sc.nextInt();
	System.out.print( "�� ��° �� �Է� : ");
	int b=sc.nextInt();
     	max = getMax(a, b);
     	sc.close();
	System.out.println(a + "�� "+b+" �� ū ���� "+max+"�Դϴ�.");
  }
  static int getMax(int a, int b){
	int max;
	if(a>b) max=a;
	else max=b;
	return max;
  }
}