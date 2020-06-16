package step10;
import java.util.Scanner;
public class Dicimal_1978 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		int count = 0, cnt = 0;

		for (int i = 1; i <= t; i++) {
			int num = sc.nextInt();
			count = 0;

			for (int j = 1; j <= num; j++) {
				if (num % j == 0)
					count++;
			}

			if (count == 2)
				cnt++;
		}
		System.out.print(cnt);
		sc.close();
    }
}
