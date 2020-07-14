package step5;
import java.util.Scanner;
public class FlagSum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt(); sc.close();
		int sum=0;
		for(int i=1; i<=num; i++) 
			if(i%2==0) {
				System.out.print("-"+i);
				sum-=i;
			}
			else {
				if(i==1) System.out.print(i);
				else System.out.print("+"+i);
				sum+=i;
			}
		System.out.println("= "+sum);
	  }
}
