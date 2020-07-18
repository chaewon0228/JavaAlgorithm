package step3;

public class AlphaBackLift {
	public static void main(String[] args){
		for(char i='Z'; i>='V'; i--){
			for(char j='Z'; j>=i; j--) System.out.print(j);
			System.out.println();
		}
	  }
}
