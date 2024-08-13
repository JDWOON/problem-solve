package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		System.out.println(solve(1000000));
	}

	public static String solve(int n) {
		ArrayList<String> list = new ArrayList<String>();

		addStr(list, "");

		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		return list.get(n - 1);
	}

	public static void addStr(List<String> list, String now) {
		if (now.length() == 10) {
			list.add(now);
		} else {
			for (char c = '0'; c <= '9'; c++) {
				if (now.indexOf(c) == -1) {
					String next = now + c;
					addStr(list, next);
				}
			}
		}
	}
}
