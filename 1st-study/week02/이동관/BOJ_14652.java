import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_14652 {
	public static void main(String[] args) throws IOException {
		// I/O set-up
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// Input
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		// var-init
		BigInteger N = new BigInteger(st.nextToken());
		BigInteger M = new BigInteger(st.nextToken());
		BigInteger K = new BigInteger(st.nextToken());

		// Calculation
		BigInteger n = K.divide(M);
		BigInteger m = K.subtract(M.multiply(n));

		// Out-put
		bw.write(n.toString());
		bw.write(" ");
		bw.write(m.toString());
		bw.flush();
	}
}
