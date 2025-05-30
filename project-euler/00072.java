package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TestMain {
	public static int MAX_VALUE = 1000000;
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	public static HashMap<Integer, ArrayList<Integer>> facts = new HashMap<Integer, ArrayList<Integer>>();

	public static void main(String[] args) {
		init();

		BigInteger sum = BigInteger.ZERO;

		for (int d = 2; d <= MAX_VALUE; d++) {
			sum = sum.add(eulerPhi(d));
		}

		System.out.println(sum);
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

	public static BigInteger eulerPhi(int d) {
		BigInteger mul = BigInteger.valueOf(d);
		BigInteger div = BigInteger.ONE;

		for (int fact : facts.get(d)) {
			mul = mul.multiply(BigInteger.valueOf(fact - 1));
			div = div.multiply(BigInteger.valueOf(fact));
		}

		mul = mul.divide(div);

		return mul;
	}
}
