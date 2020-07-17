package step3;

public class AlphaMinusRight {
	public static void main(String[] args){
		
		for(char i='A'; i<='E'; i++) 
	  	{
	       		for(int j=65; j<i; j++) System.out.print(" ");
	       		for(char j=i; j<='E'; j++) System.out.print(j);
	        		System.out.println();
	    	}
	 }
}
