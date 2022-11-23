package season2;

import java.io.*;
import java.math.BigInteger;

public class CandyMan_Ko_2547 {

    private static String calculation(BigInteger totalCandies, int studentCounts) {

        BigInteger students = new BigInteger(String.valueOf(studentCounts));

        return totalCandies.remainder(students).equals(BigInteger.ZERO) ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCases; i++) {
            String blank = br.readLine();
            BigInteger AllSUM = BigInteger.ZERO;
            int studentCounts = Integer.parseInt(br.readLine());

            for(int j=0; j<studentCounts; j++){
                Long candies = Long.parseLong(br.readLine());
                BigInteger bigint = BigInteger.valueOf(candies);
                 AllSUM = AllSUM.add(bigint);
            }

            bw.write(calculation(AllSUM, studentCounts));
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
