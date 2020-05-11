package step3;
import java.util.Scanner;
public class AtBresult_11022 {
	 public static void main(String[] args){
	        Scanner sc= new Scanner(System.in);
	        //int sum;
	        int t=sc.nextInt();
	        int n=0; 
	        for(int i=1; i<=t; i++ ){
	            int a=sc.nextInt();
	            int b=sc.nextInt();
	            n++;
	            System.out.println("Case #"+n+": "+a+" + "+b+" = "+(a+b));
	             
	 
	        }
	        sc.close();
	    }
}
