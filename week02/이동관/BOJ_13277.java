import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_13277 {
	public static void main(String[] args) throws IOException {
		//  Input : Scanner -> BufferReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//  Split : str.split() -> String Tokenizer
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();

		// Data-Type : BigInteger
		BigInteger num1 = new BigInteger(st.nextToken());
		BigInteger num2 = new BigInteger(st.nextToken());

		String result = String.valueOf(num1.multiply(num2));  // num1 * num2

		// Out-put : sout -> BufferWritter
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(result);
		bw.close();

//	Note : BufferWritter 관련 메소드
		/*
		br.write("출력할 문자열") : 문자열 출력
		bw.newLine() : 개행 ( \n || enter)
		bw.flush()  : 버퍼에 남아있는 문자열을 모두 출력
		*/
	}
}

