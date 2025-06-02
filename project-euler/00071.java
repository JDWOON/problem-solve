package test;

public class TestMain {
	public static int MAX_VALUE = 1000000;

	public static void main(String[] args) {
		Value std = new Value(3, 7);
		Value result = new Value(1, MAX_VALUE);

		for (int d = 2; d <= MAX_VALUE; d++) {
			for (int n = d * 3 / 7; n < d; n++) {
				Value now = new Value(n, d);
				Value next = new Value(n + 1, d);

				if (now.compareTo(std) < 0 && next.compareTo(std) >= 0) {
					if (now.compareTo(result) > 0) {
						result = now;
					}

					break;
				}
			}
		}

		System.out.println(result.n + " / " + result.d);
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
