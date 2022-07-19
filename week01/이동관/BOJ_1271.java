import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_1271 {
	public static void main(String[] args) throws IOException {
		// I/O set-up
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));

		// Input
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		// var-init
		BigInteger num1 = new BigInteger(st.nextToken());
		BigInteger num2 = new BigInteger(st.nextToken());

		// calculate & toString
		String mod = String.valueOf(num1.divide(num2));
		String remainder = String.valueOf(num1.remainder(num2));

		// Out-pur
		bw.write(mod);
		bw.newLine();
		bw.write(remainder);
		bw.close();
	}
}