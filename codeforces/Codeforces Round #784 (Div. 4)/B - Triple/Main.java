import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		int t = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
 
			StringTokenizer st = new StringTokenizer(br.readLine());
 
			boolean isDone = false;
 
			for (int j = 0; j < n; j++) {
				int val = Integer.parseInt(st.nextToken());
				if (map.containsKey(val)) {
					if (map.get(val) == 2) {
						bw.write(val + "\n");
						isDone = true;
						break;
					} else {
						map.put(val, map.get(val) + 1);
					}
				} else {
					map.put(val, 1);
				}
			}
 
			if (!isDone) {
				bw.write("-1\n");
			}
		}
 
		bw.flush();
	}
}