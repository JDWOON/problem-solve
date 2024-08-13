package test;

import java.util.ArrayList;

public class TestMain {
	public static int MAX_NUM = 28123;

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= MAX_NUM; i++) {
			if (isOver(i)) {
				list.add(i);
			}
		}

		boolean[] check = new boolean[MAX_NUM + 1];

		for (int a : list) {
			for (int b : list) {
				if (a + b <= MAX_NUM) {
					check[a + b] = true;
				}
			}
		}
		
		int result = 0;
		
		for(int i=1; i<=MAX_NUM; i++) {
			if(!check[i]) {
				result += i;
			}
		}
		
		System.out.println(result);
	}

	public static boolean isOver(int n) {
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}

		return sum > n;
	}
}
