package step11;
import java.util.Scanner;
public class IfExamMethod {
	 public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int a, b; 
			a = sc.nextInt();
			char op =  sc.next().charAt(0);
			b= sc.nextInt();
			sc.close();
			System.out.println( a + " "+op +" "+ b  + " = " + four_Op(a, b, op) );
			
		  }
		  static int four_Op(int a, int b, char op){
			int result=0;
			if( op == '+' ) result=a+b;
			else if ( op == '-' ) result=a-b;
			else if ( op == '*' ) result=a*b;
			else if ( op == '/' ) result=a/b;
			return result;
		  }
}
