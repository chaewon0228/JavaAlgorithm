package step3;

public class AlphaBackRight {
	 public static void main(String[] args){
			for(char i='Z'; i>='V'; i-- ){
				for(int j=90; j>i; j--) System.out.print(" ");
				for(char j=i; j>='V'; j--) System.out.print(j);
				System.out.println();
			}
		  }
}
