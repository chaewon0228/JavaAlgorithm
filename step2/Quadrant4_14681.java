package step2;
import java.util.Scanner;
public class Quadrant4_14681 {
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>0 && b>0) System.out.println("1");
        else if(a<0 && b>0) System.out.println("2");
        else if(a<0 && b<0) System.out.println("3");
        else System.out.println("4");
        sc.close();
    }
}
