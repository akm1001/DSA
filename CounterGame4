import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    static void solveMe(long N) {
        long count = 0;
        while(N != 1){
            if ((N & (N - 1)) != 0) {
                N = N - Long.highestOneBit(N);
            } else {
                N = N/2;
            }
            count++;   
        }
        if (count%2 == 1) {
            System.out.println("Louise");
        } else {
            System.out.println("Richard");
        }
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T;
        T = in.nextInt();
        for (int i = 0; i < T; i++) {
            long N;
            //System.out.println(in.nextLine());
            N = in.nextBigInteger().longValue();
            solveMe(N);
            //System.out.println(result);       
        }
   }
}
