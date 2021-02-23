package step12;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class SortAge_10814 {
	public static void main(String[] args) {		
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] an = new String[n][2];
		
		for(int i=0; i<n; i++) {
			an[i][0] = sc.next(); //나이
			an[i][1] = sc.next(); //이름
		}
        Arrays.sort(an, new Comparator<String[]>() {
			public int compare(String[] s, String[] s2) {
				return Integer.parseInt(s[0])-Integer.parseInt(s2[0]);
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(an[i][0]+" "+an[i][1]);
		}
		sc.close();
    }
}
