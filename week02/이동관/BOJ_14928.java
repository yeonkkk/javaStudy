import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_14928 {
	public static void main(String[] args) throws IOException {
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
	}
}
