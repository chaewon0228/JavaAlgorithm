package step5;
import java.util.Scanner;
public class StarHourglass_2446 {
	 public static void main(String [] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.close();
	        
	        for(int i=0; i<n; i++){
	            for(int j=0; j<i; j++) System.out.print(" ");
	            for(int a=0; a<(2*n-1)-(2*i); a++) System.out.print("*");
	            System.out.println();
	        }
	        for(int i=0; i<n-1; i++){
	            for(int j=1; j<(n-1)-i; j++) System.out.print(" ");
	            for(int a=0; a<3+(2 * i); a++) System.out.print("*");
	            System.out.println();
	        }
	    }
}
