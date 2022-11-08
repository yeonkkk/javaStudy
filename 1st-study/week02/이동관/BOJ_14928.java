import java.io.*;

public class BOJ_14928 {
	public static void main(String[] args) throws IOException {
		// I/O set-up
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// Input
		String input = br.readLine();
		br.close();

		// var-init
		int mod = 20000303;
		int result = 0;

		// Calculation
		for (int i = 0; i < input.length(); i++) {
			result *= 10;
			result += Character.getNumericValue(input.charAt(i));
			result %= mod;
		}

		// Out-put
		bw.write(String.valueOf(result));
		bw.flush();

// Wrong-Code : Time-out
/*
		// I/O set-up
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// Input
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		// var-init
		BigInteger N = new BigInteger(st.nextToken());
		BigInteger M = new BigInteger("20000303");

		// Calculation
		long result = N.remainder(M).longValue();

		// Out-put
		bw.write(String.valueOf(result));
		bw.flush();
*/
	}
}
