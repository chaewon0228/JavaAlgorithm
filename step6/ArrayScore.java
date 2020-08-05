package step6;
import java.util.Scanner;
public class ArrayScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arSubject = {"Java", "Python", "Android", "JSP", "HTML"};
	    int[] arScore = {95, 88, 76, 62, 55};
	        
	    while (true) {
	       System.out.print("과목명을 입력하세요: ");
	       String name = sc.next();
	            
	       for(int i=0; i<arSubject.length; i++) {
	    	   if (arSubject[i].equals(name)) System.out.println(arSubject[i] + "의 점수: " + arScore[i]);
	       }
	       if (name.equals("그만")) break;
	    }
	    sc.close();
	}
}
