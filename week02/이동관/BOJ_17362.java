import java.io.*;
import java.math.BigInteger;

public class BOJ_17362 {
	public static void main(String[] args) throws IOException {
		// I/O set-up
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// Input
		BigInteger num1 = new BigInteger(br.readLine());
		br.close();

		// var-init
		int input = num1.remainder(BigInteger.valueOf(8)).intValue();
		int result;

		// Calculation
		switch (input) {
			case 0:   //  input이 8일때
				result = 2;
				break;
			case 7:
				result = 3;
				break;
			case 6:
				result = 4;
				break;
			default:
				result = input;
				break;
// before-refact
/*
			case 1:
				result = 1;
				break;
			case 2:
			case 0: //  8일때는 나머지가 0
				result = 2;
				break;
			case 3:
			case 7:
				result = 3;
				break;
			case 4:
			case 6:
				result = 4;
				break;
			case 5:
				result = 5;
				break;
 */
		}

		// Out-put
		bw.write(String.valueOf(result));
		bw.flush();
	}
}
