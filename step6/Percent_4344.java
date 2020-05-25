package step6;
import java.util.Scanner;
public class Percent_4344 {
	 public static void main(String args[]){
	     Scanner sc= new Scanner(System.in);
         int c= sc.nextInt();
         int student=0;
         double average=0;
         int [] arr= new int[1000];
         for(int i=0; i<c; i++){
             student=sc.nextInt();
             int sum=0;
             int count=0;
             
             for(int j=0; j<student; j++){
                 arr[j]= sc.nextInt();
                 sum += arr[j];
             }
             average=(double)sum/student;
             
             for(int j=0; j<student; j++){
                 if(arr[j]>average){
                     count++;
                 }
             }
             System.out.printf("%.3f", 100.0 * count/student);
             System.out.println("%");
         }
         sc.close();
	    }
}
