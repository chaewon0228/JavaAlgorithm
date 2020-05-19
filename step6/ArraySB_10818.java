package step6;
import java.util.Scanner;
import java.util.Arrays;
public class ArraySB_10818 {
	 public static void main(String args[]){
	        Scanner sc= new Scanner(System.in);
	        int n= sc.nextInt();
	        int [] arr= new int [n];
	        for(int i=0; i<n; i++){
	            arr[i]= sc.nextInt();
	        }
	        sc.close();
	        Arrays.sort(arr);
	        System.out.print(arr[0]+" "+arr[n-1]);
	    }
	}