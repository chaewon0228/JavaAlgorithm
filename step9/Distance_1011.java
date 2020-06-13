package step9;

import java.util.Scanner;

public class Distance_1011 {
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
 
		int T = sc.nextInt();	
		
		for(int i = 0; i < T; i++) {
        
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			int distance = Y - X;	
			
			int max = (int)Math.sqrt(distance);	
            
			if(max == Math.sqrt(distance)) {
				System.out.println(max * 2 - 1);
			}
			else if(distance <= max * max + max) {
				System.out.println(max * 2);
			}
			else {
				System.out.println(max * 2 + 1);
			}
			
		}
		sc.close();
	}
}
