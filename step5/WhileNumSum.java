package step5;
import java.util.Scanner;
public class WhileNumSum {
	public static void main(String[] args) {
       System.out.print("���ڸ� �Է��ϼ��� : ");
           Scanner sc = new Scanner(System.in);
           int num = 0, sum = 0; 
           num = sc.nextInt(); sc.close();
           
           while(num!=0){
              sum += num%10;
              num /= 10;
           }
           System.out.println("�� �ڸ����� ���� "+sum+"�Դϴ�.");
           
   }
}
