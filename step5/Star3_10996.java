package step5;
import java.util.Scanner;
public class Star3_10996 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= 2*N; i++){
	        if(i % 2 == 1){
		        for(int j = 1; j <= N; j++){
			
			        if(j % 2 == 1){
				        System.out.print("*");
			        }
			        else System.out.print(" ");
			
		        }
	        }
 
	         else{
		        for(int j = 1; j <= N; j++){
			
			        if(j % 2 == 1){
				        System.out.print(" ");
			        }
			        else System.out.print("*");
			
		        }
	        }
	     System.out.print("\n");
         sc.close();
         }
    }
}
