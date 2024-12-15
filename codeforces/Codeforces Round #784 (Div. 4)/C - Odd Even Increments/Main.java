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
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
 
			StringTokenizer st = new StringTokenizer(br.readLine());
 
			boolean isDone = false;
 
			for (int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(st.nextToken());
 
				if (j > 1) {
					if (a[j] % 2 != a[j - 2] % 2) {
						bw.write("NO\n");
						isDone = true;
						break;
					}
				}
			}
 
			if (!isDone) {
				bw.write("YES\n");
			}
		}
 
		bw.flush();
	}
}