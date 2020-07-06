package step4;
import java.util.Scanner;
public class DigitsBack {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("¼ö ÀÔ·Â : ");
	  int n = sc.nextInt();
	  sc.close();
	  
	  while(n>0) {
		  System.out.print(n%10);
		  System.out.print("  ");
		  n=n/10;
	  }
	  System.out.println();
  }
}
