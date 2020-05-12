package step3;
import java.util.Scanner;
public class Star2_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       int n= sc.nextInt();
	       
	       for(int i=0; i<n; i++) { 
	           
	           for(int j=i+1; j<n; j++) {
	           
	               System.out.print(" ");
	               
	               
	           }
	           
	           for(int k=n-i; k<=n; k++) {
	               
	               System.out.print("*");   
	           }            
	                    
	       sc.close();
	       System.out.println();
	      }

	}

}
