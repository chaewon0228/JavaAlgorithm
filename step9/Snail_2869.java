package step9;
import java.util.Scanner;
public class Snail_2869 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt(); 
        int down = sc.nextInt(); 
        int v = sc.nextInt(); 
        int day;
        day = (v-down) / (up - down); 
        if ((v-down) % (up - down) != 0 ) day++;

        System.out.println(day);
        sc.close();
    }
}
