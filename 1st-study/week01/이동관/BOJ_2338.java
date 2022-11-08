import java.io.*;
import java.math.BigInteger;

public class BOJ_2338 {
	public static void main(String[] args) throws IOException {
		// I/O set-up
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));

		// Var-init
		BigInteger num1 = new BigInteger(br.readLine());
		BigInteger num2 = new BigInteger(br.readLine());
		br.close();

		// Calculate
		String plus = String.valueOf(num1.add(num2));
		String minus = String.valueOf(num1.subtract(num2));
		String multiple = String.valueOf(num1.multiply(num2));

		// Out-pur
		bw.write(plus);
		bw.newLine();
		bw.write(minus);
		bw.newLine();
		bw.write(multiple);
		bw.close();
	}
}