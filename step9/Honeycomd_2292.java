package step9;
import java.util.Scanner;
public class Honeycomd_2292 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int count = 1;
        int range = 1;
        int kan = 1;
        
        while(true) {
            if(range >= n) {
                break;
            }
            kan = 6*(count++);
            range += kan;
            
        }
        System.out.println(count);
        sc.close();
    }
}
