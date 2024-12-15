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
			int[] cnt = new int[11 * 11];
			for (int j = 0; j < cnt.length; j++) {
				cnt[j] = 0;
			}
 
			long result = 0;
 
			for (int j = 0; j < n; j++) {
				String s = br.readLine();
				int val = ((int) (s.charAt(0) - 'a')) * 11 + ((int) (s.charAt(1) - 'a'));
 
				long temp = 0;
				for (int k = 0; k < 11; k++) {
					temp += cnt[val - (val % 11) + k];
					temp += cnt[k * 11 + (val % 11)];
				}
				temp -= cnt[val] * 2;
 
				cnt[val]++;
 
				result += temp;
			}
 
			bw.write(result + "\n");
		}
 
		bw.flush();
	}
}