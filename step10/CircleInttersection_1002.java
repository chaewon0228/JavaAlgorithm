package step10;
import java.util.Scanner;
public class CircleInttersection_1002 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x1, y1, r1, x2, y2, r2;
        double d;
        for(int i=0; i<t; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			d=Math.sqrt((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
			
			if(x1==x2 && y1==y2 && r1==r2) System.out.println(-1);
			else if(d==r1+r2 || Math.abs(r1-r2)==d)
				System.out.println(1);
			else if(d>r1+r2 || x1==x2 && y1==y2 && r1!=r2 || d<Math.abs(r1-r2))
				System.out.println(0);
			else System.out.println(2);
		}
        sc.close();
    }
}
