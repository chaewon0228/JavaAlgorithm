package step9;
import java.util.Scanner;
public class Fraction_1193 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = 0;
        int divisor = 0;
        int dividend = 0;
        for(int i=1; i<10000; i++) {
            if(num>t && t+i>=num) {
                if(i%2==0) {
                    divisor=i+1-(num-t);
                    dividend=(num-t);    
                }
                else {
                    divisor=(num-t);
                    dividend=i+1-(num-t);
                }
                break;
            }
            t+=i;
        }
        System.out.print(dividend+"/"+divisor);
        sc.close();
    }
}
