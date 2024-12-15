import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		for (int i = a; i <= b; i++) {
			if (isPal(i) && isPrime(i)) {
				bw.write(i + "\n");
			}
		}

		bw.write("-1\n");

		bw.flush();
	}

	public static boolean isPal(int n) {
		int rev = 0;

		for (int i = n; i > 0; i /= 10) {
			rev = (rev * 10) + (i % 10);
		}

		return rev == n;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}