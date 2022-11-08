import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_1550 {
	public static void main(String[] args) throws IOException {
		// I/O set-up
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));

		// var-init & Convert
		int num1 = Integer.parseInt(br.readLine(),16);
		br.close();

		// Out-pur
		bw.write(String.valueOf(num1));
		bw.close();
	}
}