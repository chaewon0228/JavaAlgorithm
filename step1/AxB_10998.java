package step1;
import java.util.Scanner;
public class AxB_10998 {
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<10 && b<10)
        System.out.println(a*b);
        sc.close();
    }
}
