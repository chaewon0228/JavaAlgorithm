package step2;
import java.util.Scanner;
public class CircleSL{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("�� �Է� : ");
	int a = sc.nextInt();
	sc.close();
	
	double s, l;
	final double pi=3.14;
	
	if(a==1){
		s=13*13*pi;
		System.out.print("������ 13�� ���� ���� : "+s);
	}
	else if(a==2){
		l=17*2*pi;
		System.out.print("������ 17�� ���� �ѷ� : "+l);
	}
	else if(a==3){
		s=4.5*4.5*pi;
		l=9*pi;
		System.out.println("���� 9�� ���� ���� : "+s);
		System.out.println("���� 9�� ���� �ѷ� : "+l);
	}
	else System.out.println("�� �Է� ����");
  }
}
