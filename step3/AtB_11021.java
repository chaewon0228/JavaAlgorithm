package step3;
import java.util.Scanner;
public class AtB_11021 {
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int t=sc.nextInt();
        int n=0; 
        for(int i=1; i<=t; i++ ){
            int a=sc.nextInt();
            int b=sc.nextInt();
            n++;
            System.out.println("Case #"+n+": "+(a+b));
             
 
        }
        sc.close();
    }
}
