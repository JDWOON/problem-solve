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
			int m = Integer.parseInt(st.nextToken());
 
			char[][] map = new char[n][m];
 
			for (int j = 0; j < n; j++) {
				map[j] = br.readLine().toCharArray();
			}
 
			for (int x = 0; x < m; x++) {
				for (int y = 0; y < n; y++) {
					int empty = 0, rock = 0, start = y;
 
					while (y < n) {
						if (map[y][x] == 'o') {
							break;
						} else if (map[y][x] == '*') {
							rock++;
						} else if (map[y][x] == '.') {
							empty++;
						}
						y++;
					}
 
					for (int k = start; k < y; k++) {
						if (k - start < empty) {
							map[k][x] = '.';
						} else {
							map[k][x] = '*';
						}
					}
				}
			}
 
			for (char[] line : map) {
				bw.write(new String(line) + "\n");
			}
			bw.write("\n");
		}
 
		bw.flush();
	}
}