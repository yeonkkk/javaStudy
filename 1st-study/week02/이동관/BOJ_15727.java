import java.io.*;

public class BOJ_15727 {
	public static void main(String[] args) throws IOException {
		// I/O set-up
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// Input
		int distance = Integer.parseInt(br.readLine());

		// var-init
		int max = 5;
		int result;

		// Calculation
		if (distance % max == 0) {
			result = distance / max;
		} else {
			result = (distance / max) + 1;
		}

		// Out-put
		bw.write(String.valueOf(result));
		bw.flush();
	}
}
