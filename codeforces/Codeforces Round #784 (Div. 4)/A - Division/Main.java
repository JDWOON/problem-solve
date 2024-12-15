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
			int rating = Integer.parseInt(br.readLine());
 
			String s = "Division ";
 
			if (rating >= 1900) {
				s += "1";
			} else if (rating >= 1600) {
				s += "2";
			} else if (rating >= 1400) {
				s += "3";
			} else {
				s += "4";
			}
 
			bw.write(s + "\n");
		}
 
		bw.flush();
	}
}