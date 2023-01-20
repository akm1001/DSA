

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; ++i) {
			BigInteger n = new BigInteger(sc.next());
			int cnt = 0;
			while (n.compareTo(BigInteger.ONE) == 1) {
				BigInteger x = BigInteger.ONE;
				while (x.shiftLeft(1).compareTo(n) < 0) {
					x = x.shiftLeft(1);
				}
				++cnt;
				n = n.subtract(x);
			}
			System.out.println(cnt % 2 == 0 ? "Richard" : "Louise");
		}
		System.out.flush();

	}
}
