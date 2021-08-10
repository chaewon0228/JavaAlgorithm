package step13;
import java.util.Scanner;
public class 분해합_2231 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
        	int n = sc.nextInt(); 
        	int size = String.valueOf(n).length();
        	int start = n - (9 * size); 
        	int result = 0;
        
        	for(int i=start; i<n; i++){
            		int sum = i;
            		int j = i;
           
           		while(j>0){
                		sum += j%10;
                		j /= 10;
            		}
            
            		if(sum == n){
                		result = i;
                		break;
            		}
        	}
        	System.out.println(result);
        	sc.close();
	}
}

