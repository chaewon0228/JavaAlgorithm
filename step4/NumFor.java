package step4;

import java.util.Scanner;

public class NumFor {
	 public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			sc.close();
			
			for(int i=1; i<=1000; i*=10){
				System.out.println(i+"ÀÚ¸® : "+(a/i)%10); 
				
			}
		  }
}
