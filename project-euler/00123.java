package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
	public static ArrayList<Integer> primes = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		init();

		solve();
	}

	public static void init() {
		boolean[] check = new boolean[1000000];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}

				primes.add(i);
			}
		}
	}

	public static void solve() {
		for (int i = 0; i < primes.size(); i += 2) {
			BigInteger a = BigInteger.valueOf(primes.get(i));
			BigInteger b = BigInteger.valueOf(i + 1);

			BigInteger temp = a.multiply(b).multiply(BigInteger.TWO).mod(a.pow(2));

			if (temp.compareTo(BigInteger.valueOf(10000000000L)) > 0) {
				System.out.println(i + 1);
				return;
			}
		}
	}
}