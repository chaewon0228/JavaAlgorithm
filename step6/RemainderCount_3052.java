package step6;
import java.util.Scanner;
public class RemainderCount_3052 {
	public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int [] arr= new int [10];
        int count=0;
         for(int i=0; i<10; i++) {   
           arr[i] = sc.nextInt()%42; 
         
         }
         for(int i=0; i<10; i++) {     
             int cnt = 0;
             for(int j=i+1 ;j<10 ;j++) {   
                 if(arr[i]==arr[j]) {    
                     cnt++;
                 }
             }
             if(cnt==0) {   
                count++;
             }
        }
        System.out.println(count);
        sc.close();
	}
}
