package step3;
import java.util.Scanner;
public class StarBack {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  sc.close();
	  
	  for(int i=0; i<n; i++){
			for(int j=n; i<j; j--){
				System.out.print("*");
			}
			System.out.println("");
	  }
	  System.out.println("");
  }
}
