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
 
		int t = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
 
			int[] b = new int[31];
 
			for (int j = 0; j < 31; j++) {
				b[j] = n;
			}
 
			st = new StringTokenizer(br.readLine());
 
			for (int j = 0; j < n; j++) {
				int temp = Integer.parseInt(st.nextToken());
 
				for (int x = 0; x < 31; x++) {
					if ((temp & (1 << x)) != 0) {
						b[x]--;
					}
				}
			}
 
			long val = 0;
 
			for (int j = 30; j > -1; j--) {
				if (b[j] <= k) {
					val += 1;
					k -= b[j];
				}
 
				if (j > 0) {
					val *= 2;
				}
			}
 
			bw.write(val + "\n");
		}
 
		bw.flush();
	}
}