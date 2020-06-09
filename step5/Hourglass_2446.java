package step5;
import java.util.Scanner;
public class Hourglass_2446 {
	public void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n-1; i>=0; i--) {
        	for(int j=1; j<n-i; j++) {
        		System.out.println(" ");
        	}
        	for(int j=0; j<i*2+1; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        for(int i=1; i<n; i++) {
        	for(int j=1; j<n-i; j++) {
        		System.out.println(" ");
        	}
        	for(int j=0; j<i*2+1; j++) {
        		System.out.print("*");
        	}
            System.out.println();
            sc.close();
        }
    }
}
