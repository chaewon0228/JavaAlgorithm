package step5;

public class ForDice {
	public static void main(String[] args) {
		int sum = 6;
		for (int i = 1; i <= 6; i++) {
			for (int j = sum; j > 0; j--) {
				if (i + j == 6) {
					System.out.println(i + "+" + j + "=" + (i + j));
				}
			}
		}
	}
}
