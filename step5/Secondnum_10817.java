package step5;
import java.util.Scanner;
import java.util.Arrays;
public class Secondnum_10817 {
	public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] array= new int[3];
        array[0]= sc.nextInt();
        array[1]= sc.nextInt();
        array[2]= sc.nextInt();
        Arrays.sort(array);
        System.out.println(array[1]);
        sc.close();
    }
}
