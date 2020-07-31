package step10;

import java.util.Scanner;

public class Dicimal {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); sc.close();
		
		int cnt=0; 
		for(int i=2; i<=num; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j == 0) cnt++;
			}
			if(cnt==1) System.out.print(i+"\t");
			cnt=0;
		}
	  }
}
