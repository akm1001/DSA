import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		BigInteger [] powers2 = new BigInteger[64];
		powers2[0] = BigInteger.ONE;
		BigInteger two = new BigInteger("2");
		for(int i = 1; i <= 63; i++) {
			powers2[i] = two.multiply(powers2[i-1]);
		}
		
//		for(int i = 0; i <= 63; i++)
//			System.out.print(powers2[i]+" ");
//		System.out.println();
		int t = Integer.parseInt(br.readLine());
		
		

		while(t-- > 0) {
			BigInteger n = new BigInteger(br.readLine());
			int turns = 0;
			while(!n.equals(BigInteger.ONE)) {
				//System.out.println("here " + n);
				int index = Arrays.binarySearch(powers2, n);
				if(index >= 0) { // power of two
					n = powers2[index-1]; // reduce by half
				}
				else {
					//System.out.println("index : " + index);
					index += 1;
					index = -index;
					index -= 1;
					//System.out.println("SubTract by : " + powers2[index]);
					n = n.subtract(powers2[index]);
					//break;
				}
				turns++;
			}
			if(turns % 2 == 0) {
				pr.println("Richard");
			}
			else {
				pr.println("Louise");
			}
		}
		pr.close();
	}
}
