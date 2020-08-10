package step5;
import java.util.Scanner;
public class WhileNumSum {
	public static void main(String[] args) {
       System.out.print("숫자를 입력하세요 : ");
           Scanner sc = new Scanner(System.in);
           int num = 0, sum = 0; 
           num = sc.nextInt(); sc.close();
           
           while(num!=0){
              sum += num%10;
              num /= 10;
           }
           System.out.println("각 자리수의 합은 "+sum+"입니다.");
           
   }
}
