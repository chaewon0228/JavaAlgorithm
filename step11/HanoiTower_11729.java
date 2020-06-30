package step11;
import java.util.Scanner;
public class HanoiTower_11729 {
	static int t, count = 0;
    public static StringBuilder sb = new StringBuilder();
    static void hanoi(int t, int a, int b, int c){
        count++;
        if(t==1){
            sb.append(a+" "+c+"\n");
            return;
        }
        else{
            hanoi(t-1, a, c, b);
            sb.append(a+" "+c+"\n");
            hanoi(t-1,b,a,c);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        hanoi(t,1,2,3);
		System.out.println(count);
		System.out.println(sb);
        sc.close();
    }
}
