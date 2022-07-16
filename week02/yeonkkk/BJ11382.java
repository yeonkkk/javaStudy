import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BJ11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        BigInteger c = new BigInteger(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger result = a.add(b).add(c);
        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}
