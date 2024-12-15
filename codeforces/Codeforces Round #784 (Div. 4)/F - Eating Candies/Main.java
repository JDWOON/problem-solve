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
			int w[] = new int[n];
 
			StringTokenizer st = new StringTokenizer(br.readLine());
 
			for (int j = 0; j < n; j++) {
				w[j] = Integer.parseInt(st.nextToken());
			}
 
			int left = 0, right = n - 1, alice = 0, bob = 0, max = 0;
 
			while (left <= right) {
				if (alice < bob) {
					alice += w[left];
					left++;
				} else {
					bob += w[right];
					right--;
				}
 
				if (alice == bob) {
					max = left + (n - 1 - right);
				}
			}
 
			bw.write(max + "\n");
		}
 
		bw.flush();
	}
}