package step10;
import java.util.Scanner;
public class DicimalSum_9020 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0; 
		
		System.out.print("2이상 짝수 개수 입력 : ");
		int t = sc.nextInt();

		for(int j=0; j<t; j++){
			System.out.print("2이상 짝수 입력 : ");
			int n = sc.nextInt();
			
			for(a=n/2,b=n/2; ; a++,b--){
				n=a+b;
				if(check(a)&&check(b)){
					System.out.println(b + " " + a);
					break;
				}
			}
		}
		sc.close();
	}
	
	public static boolean check(int n){
		for(int i=2; i<=n/2; i++){
			if(n%i == 0) return false;
		}
		return true;
	}
}
