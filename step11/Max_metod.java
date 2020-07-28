package step11;
import java.util.Scanner;
public class Max_metod{
   public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int max;
	System.out.print( "첫 번째 수 입력 : ");
	int a=sc.nextInt();
	System.out.print( "두 번째 수 입력 : ");
	int b=sc.nextInt();
     	max = getMax(a, b);
     	sc.close();
	System.out.println(a + "와 "+b+" 중 큰 수는 "+max+"입니다.");
  }
  static int getMax(int a, int b){
	int max;
	if(a>b) max=a;
	else max=b;
	return max;
  }
}