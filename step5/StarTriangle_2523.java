package step5;
import java.util.Scanner;
public class StarTriangle_2523 {
	 public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int i=1; i<=n; i++) {
	        	for(int j=0; j<i; j++) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        for(int i=n-1; i>0; i--) {
	        	for(int j=0; j<i; j++) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        
	        sc.close();
	 }
}
