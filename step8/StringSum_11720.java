package step8;
import java.util.Scanner;
public class StringSum_11720 {
	public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        String line = sc.next();
        for(int i=0; i<a; i++){
            sum += line.charAt(i)-'0';
        }
        System.out.println(sum);
        sc.close();
    }
}
