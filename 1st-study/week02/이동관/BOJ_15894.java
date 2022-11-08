import java.io.*;
import java.math.BigInteger;

public class BOJ_15894 {
	public static void main(String[] args) throws IOException {
		// I/O set-up
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// Input
		BigInteger num1 = new BigInteger(br.readLine());
		br.close();

		// Calculation
		BigInteger result = num1.multiply(BigInteger.valueOf(4));

		// Out-put
		bw.write(String.valueOf(result));
		bw.flush();
	}
}
