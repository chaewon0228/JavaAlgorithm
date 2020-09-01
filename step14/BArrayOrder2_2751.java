package step14;

import java.util.*;
import java.io.*;
public class BArrayOrder2_2751 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0; i<n; i++) arr.add(Integer.parseInt(br.readLine()));
        Collections.sort(arr);
        for (int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}
