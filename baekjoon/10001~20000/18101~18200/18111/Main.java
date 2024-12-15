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

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[][] land = new int[n][m];

		int sum = b;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				land[i][j] = Integer.parseInt(st.nextToken());
				sum += land[i][j];
			}
		}

		int[] time = new int[(sum / (n * m)) + 1];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < time.length; k++) {
					if (land[i][j] > k) {
						time[k] += (land[i][j] - k) * 2;
					} else if (land[i][j] < k) {
						time[k] += k - land[i][j];
					}
				}
			}
		}

		int idx = 0;

		for (int i = 0; i < time.length; i++) {
			if (time[idx] >= time[i]) {
				idx = i;
			}
		}

		bw.write(time[idx] + " " + idx);

		bw.flush();
	}
}