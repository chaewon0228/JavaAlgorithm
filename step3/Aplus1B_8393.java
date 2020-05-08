package step3;
import java.util.Scanner;
public class Aplus1B_8393 {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int a=1; a<=n; a++){
            sum+=a;
        }
        System.out.println(sum);
        sc.close();
    }
}
