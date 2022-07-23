import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_13277 {
	public static void main(String[] args) throws IOException {
	//  Input : Scanner -> Buffered Reader
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

	//  Split : str.split() -> String Tokenizer
		StringTokenizer st =
				new StringTokenizer(br.readLine());
		br.close();

	// Data-Type : BigInteger
		BigInteger num1 = new BigInteger(st.nextToken());
		BigInteger num2 = new BigInteger(st.nextToken());

	// Calculate & Convert : num1 * num2
		BigInteger result = num1.multiply(num2);
		String toString = String.valueOf(result);

	// Out-put : sout -> BufferWritter
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(toString);
		bw.close();

//	Note 1 : Buffered Writter 관련 메소드
		/*
		br.write("출력할 문자열") : 문자열 출력
		bw.newLine() : 개행 ( \n || enter)
		bw.flush()  : 버퍼에 남아있는 문자열을 모두 출력
		*/
//	Note 2 : 숫자형 Data의 Type별 최대,최소값
		/*
		int = ± 2,147,483,647
		long =  ± 9,223,372,036,854,775,807
		BigInteger = ∞
		*/
//	Note 3 : I/O 방식별 속도 차이 ( 단위 : 초 )
		/*
		// Input
			1. BufferedReader, Integer.parseInt	: 0.6585
			2. scanner : 4.8448

		// Output
			1. BufferedWriter, bf.write(i + "\n");	: 0.9581
			2. StringBuilder + sout : 1.1881
			3. PrinterWritter : 1.954
			4. sout : 30.013
		*/
	}
}