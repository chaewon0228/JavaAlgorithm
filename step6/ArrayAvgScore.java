package step6;
import java.util.Scanner;
public class ArrayAvgScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] score = new int[5];
		int sum=0;
		
		for(int i=0; i<score.length; i++) {
			System.out.print("성적 입력 : ");
			score[i]=sc.nextInt();
			sum+=score[i];
		}
		int avg = sum/score.length;
		System.out.println("평균 : "+avg);
		sc.close();
	}
}
