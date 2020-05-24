package step6;
import java.util.Scanner;
public class OX_8958 {
	 public static void main(String args[]){
	        Scanner sc= new Scanner(System.in);
	        int n= sc.nextInt();
	        String[] arr= new String[n+1];
	        for (int i=0; i<n; i++) {
	            int sum= 0;
	            int count= 0;
	            arr[i]= sc.next();
	            for (int j=0; j<arr[i].length(); j++) {
	                if (arr[i].charAt(j) == 'O')
	                    sum += ++count;
	                else count= 0;
	            }
	            System.out.println(sum);
	        }
	        sc.close();
	    }
}
