package step5;
import java.util.Scanner;
public class ForAlphaNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0); sc.close();
		if(ch>='A' && ch<='Z') for(char i='A'; i<='Z'; i++) System.out.print(i+"  ");
		else if(ch>='a' && ch<='z') for(char i='a'; i<='z'; i++) System.out.print(i+"  ");
		else System.out.println("알파벳 입력 오류");
	  }
}
