package step2;
import java.util.Scanner;
public class ScoreSwitch {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("점수 입력 : ");
	        int i = sc.nextInt(); 
	        sc.close();
	        
	        String grade = "";
	        switch(i/10) {
	        case 10: 
	        case 9:
	            grade="A";
	            break; 
	        case 8: 
	            grade="B";
	            break;
	        case 7: 
	            grade="C";
	            break;
	        case 6: 
	            grade="D";
	            break;
	        default : 
	            grade="F";
	           
	        }
	        System.out.println(grade+"학점 입니다."); 
	}
}
