package step6;

public class ArrayChar {
	public static void main(String[] args) { 
		int num[]=new int[]{3,2,5,6,1}; 
		for(int i=0;i<num.length;i++){ 
			for(int j=1;j<=num[i];j++){ 
				System.out.print('@'); 
			} 
			System.out.println(); 
		}
	}
}
