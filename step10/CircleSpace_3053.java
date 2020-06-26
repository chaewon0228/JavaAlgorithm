package step10;
import java.util.Scanner;
public class CircleSpace_3053 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        String c = String.format("%.6f", Math.PI * r * r);
        String f = String.format("%.6f", (double)2 * r * r);        
        System.out.println(c);
        System.out.println(f);
    }
}
