package step10;

import java.util.Scanner;

public class NumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터 입력 : ");
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=1000; i*=10) {
			System.out.println(i+"의 자리 : "+(a/i)%10);
		}
	}
}
