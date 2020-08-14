package step13;
import java.util.Scanner;

public class HeightWeight_7568 {
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int xy[][] = new int [n][2];
	        int rank [] = new int [n];
	        
	        for(int i=0; i<n; i++){
	            xy[i][0] = sc.nextInt();
	            xy[i][1] = sc.nextInt();
	            rank[i] = 1;
	        }
	        
	        for(int i=0; i<n; i++){
	            for(int j=0; j<n; j++){
	                if(xy[i][0] > xy[j][0] && xy[i][1] > xy[j][1]) rank[j]++;
	            }
	        }
	       
	        for(int i=0; i<n; i++) System.out.print(rank[i]+" ");
	        sc.close();
	}
}

