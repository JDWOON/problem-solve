import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		int t = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
 
			boolean isDone = false;
 
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == 'W') {
					continue;
				} else {
					int len = 0;
					boolean hasB = false, hasR = false;
					while (true) {
						if (j > n - 1 || s.charAt(j) == 'W') {
							break;
						} else if (s.charAt(j) == 'B') {
							hasB = true;
						} else if (s.charAt(j) == 'R') {
							hasR = true;
						}
 
						j++;
						len++;
					}
 
					if (len == 1 || !(hasB && hasR)) {
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