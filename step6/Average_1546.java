package step6;
import java.util.Scanner;
public class Average_1546 {
	public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        double max= 0;
        double total= 0;
        double average []= new double[n];
        for (int i=0; i<n; ++i){
        	average[i]= sc.nextInt();
            if(average[i]>max){
                max= average[i];
            }
        }
        for(int i=0; i<n; i++) {
        	average[i]= average[i]/max*100;
        	total += average[i];
        }
        System.out.println(total/n);
        sc.close();
    }
}
