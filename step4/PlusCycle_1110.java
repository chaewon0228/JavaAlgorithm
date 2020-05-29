package step4;
import java.util.Scanner;
public class PlusCycle_1110 {
	public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int num= a;
        int count=0;
        int t,o;
        do{
            t= num/10;
            o= num - 10*t;
            
            num= 10*o + ((t+o) % 10);
            count++;
        }while(num!=a);
        System.out.println(count);
        sc.close();
    }
}
