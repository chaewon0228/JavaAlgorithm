package step12;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
 public class WordSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		sc.nextLine();	
 
		for (int i=0; i<n; i++) {
			a[i] = sc.nextLine();
		}
		
		Arrays.sort(a, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) return s1.compareTo(s2);
				else return s1.length() - s2.length();
			}
		});
		
		System.out.println(a[0]);
		for (int i=1; i<n; i++) {
			if (!a[i].equals(a[i-1])) {
				System.out.println(a[i]);
			}
		}
		sc.close();
	}
 
}
