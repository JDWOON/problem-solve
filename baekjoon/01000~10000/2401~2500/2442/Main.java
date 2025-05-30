import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			for (int k = n - 1; k > i; k--) {
				bw.write(" ");
			}

			for (int k = 0; k < 2 * i + 1; k++) {
				bw.write("*");
			}

			bw.write("\n");
		}

		bw.flush();
	}
}
