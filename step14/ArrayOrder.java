package step14;
import java.util.Scanner; 
public class ArrayOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
        int min, index = 0, a; 
        int num = sc.nextInt(); sc.close();
        int [] arr = new int [1001]; 
        
        for(int i=0; i<num; i++) arr[i] = sc.nextInt(); 
        
        for(int i=0; i<num; i++) { 
            min = 1001; 
            
            for(int j=i; j<num; j++){ 
                if(min>arr[j]){ 
                    min = arr[j]; 
                    index = j; 
                } 
            } 
            a = arr[i]; 
            arr[i] = arr[index]; 
            arr[index] = a; 
        } 
        for(int i=0; i<num; i++) System.out.println(arr[i]);
    } 
}
