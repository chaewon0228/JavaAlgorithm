package step10;
import java.util.Scanner;
public class TimePay {
	public static void main(String[] args) {

		final int rate = 5000;
		int pay;
		int hours;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ð��� �Է��ϼ���");
		hours = sc.nextInt();
		sc.close();
		

		if (hours >8) pay = rate * 8 +(int)(1.5*rate*(hours-8));
		else pay = rate * hours;

		System.out.printf("�ӱ��� %d�Դϴ�.\n",pay);	

	}
}
