package step2;

public class SwitchExam {
		  public static void main(String[] args){
			int a = Integer.parseInt( args[0] );
			int day;
			
			switch( a ) {
			  case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				day = 31; break;
			  case 4 : case 6 : case 9 : case 11 :
				day = 30; break;
			  default : day = 28;
			}
			System.out.println( a + "���� " + day + "���Դϴ�.");
		  }
		
}
