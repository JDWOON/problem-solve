package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TestMain {
	public static int MAX_VALUE = 10000000;
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	public static HashMap<Integer, ArrayList<Integer>> facts = new HashMap<Integer, ArrayList<Integer>>();

	public static void main(String[] args) {
		init();

		Value min = new Value(2, 1);
		int result = 0;

		for (int n = 2; n < MAX_VALUE; n++) {
			int euler = eulerPhi(n);

			if (check(n, euler)) {
				Value temp = new Value(n, euler);

				if (min.compareTo(temp) > 0) {
					min = temp;
					result = n;
				}
			}
		}

		System.out.println(result);
	}

	public static void init() {
		boolean[] temp = new boolean[MAX_VALUE + 1];
		Arrays.fill(temp, true);

		for (int i = 1; i < temp.length; i++) {
			facts.put(i, new ArrayList<Integer>());
		}

		for (int i = 2; i < temp.length; i++) {
			if (temp[i]) {
				primes.add(i);
				facts.get(i).add(i);

				for (int j = 2; i * j < temp.length; j++) {
					temp[i * j] = false;
					facts.get(i * j).add(i);
				}
			}
		}
	}

	public static int eulerPhi(int d) {
		BigInteger mul = BigInteger.valueOf(d);
		BigInteger div = BigInteger.ONE;

		for (int fact : facts.get(d)) {
			mul = mul.multiply(BigInteger.valueOf(fact - 1));
			div = div.multiply(BigInteger.valueOf(fact));
		}

		mul = mul.divide(div);

		return mul.intValue();
	}

	public static boolean check(int a, int b) {
		char[] ac = Integer.toString(a).toCharArray();
		char[] bc = Integer.toString(b).toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);

		return new String(ac).equals(new String(bc));
	}

	public static class Value implements Comparable<Value> {
		int n, d;

		Value(int n, int d) {
			this.n = n;
			this.d = d;
		}

		@Override
		public int compareTo(Value o) {
			return Long.compare((long) n * o.d, (long) o.n * d);
		}
	}
}
