package step8;
import java.util.Scanner;
public class GroupWord_1316 {
	public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        String [] words = new String[num];
        char[] one;
        int count = 0;
        int result =0;
        
        for(int i=0; i<num; i++){
            words[i] = sc.next();
            one = words[i].toCharArray();
            for(int a=0; a<one.length; a++){
                for(int b= a+1; b<one.length; b++){
                    if(one[a]==one[b] & one[a] != one[b-1]){
                        count =1;
                    }
                }
            }
            if(count == 0){
                result += 1;
            }
            count = 0;
        }
        System.out.println(result);
        sc.close();
    }
}
