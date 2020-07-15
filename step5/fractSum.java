package step5;
import java.util.Scanner;
public class fractSum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.close();
		double sum=0; 
		for(int i=1; i<=n; i++){
			if(i==1) System.out.print("1");
			System.out.print("+" + "(1/" + i + ")");
			sum += (double)1/i;
		}
		System.out.print("= " + sum);
	  }
}
