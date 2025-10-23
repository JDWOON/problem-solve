package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestMain {
	public static final int P_MAX = 4;
	public static final int P_DICE = 9;
	public static final int C_MAX = 6;
	public static final int C_DICE = 6;

	public static long[][] pCnt = new long[P_DICE + 1][P_MAX * P_DICE + 1];
	public static long[][] cCnt = new long[C_DICE + 1][C_MAX * C_DICE + 1];

	public static void main(String[] args) throws Exception {
		init();

		long pSum = fact(P_MAX, P_DICE);
		long cSum = fact(C_MAX, C_DICE);

		long total = pSum * cSum;

		long count = 0;

		for (int i = 0; i < pCnt[P_DICE].length; i++) {
			for (int j = 0; i > j && j < pCnt[P_DICE].length; j++) {
				count += pCnt[P_DICE][i] * cCnt[C_DICE][j];
			}
		}

		BigDecimal result = BigDecimal.valueOf(count).divide(BigDecimal.valueOf(total), 7, RoundingMode.HALF_UP);

		System.out.println(result);
	}

	public static void init() {
		for (int i = 1; i <= P_MAX; i++) {
			pCnt[1][i] = 1;
		}

		for (int i = 2; i < pCnt.length; i++) {
			for (int j = 0; j < pCnt[0].length; j++) {
				for (int k = 1; k <= P_MAX && j + k < pCnt[0].length; k++) {
					pCnt[i][j + k] += pCnt[i - 1][j];
				}
			}
		}

		for (int i = 1; i <= C_MAX; i++) {
			cCnt[1][i] = 1;
		}

		for (int i = 2; i < cCnt.length; i++) {
			for (int j = 0; j < cCnt[0].length; j++) {
				for (int k = 1; k <= C_MAX && j + k < cCnt[0].length; k++) {
					cCnt[i][j + k] += cCnt[i - 1][j];
				}
			}
		}
	}

	public static long fact(int a, int b) {
		long result = 1;

		while (b > 0) {
			b--;
			result *= a;
		}

		return result;
	}
}