package step6;
import java.util.Scanner;
public class NumberCount_2577 {
	 public static void main(String args[]){
	        Scanner sc= new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        int result=a*b*c;
	        int [] arr= new int [10];
	        while(result != 0) {
	            int data = result % 10;
	            arr[data]++;
	            
	            result /= 10;
	        }
	        for(int i=0; i<arr.length; i++){
	            System.out.println(arr[i]);
	        }
	        sc.close();
	    }
}
