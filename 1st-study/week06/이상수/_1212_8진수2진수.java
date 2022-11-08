package week6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _1212_8진수2진수 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String num = st.nextToken();
        BigInteger tmp = new BigInteger(num,8);

        bw.write(tmp.toString(2));
        bw.flush();
        bw.close();
//====================================================================
//        String[] eight = new String[]{"000","001","010","011","100","101","110","111"};
//        StringBuilder sb = new StringBuilder("");
//        for(int i=0; i<num.length(); i++){
//            String tmp = eight[Integer.parseInt(String.valueOf(num.charAt(i)))];
//            if(i == 0){
//                tmp = String.valueOf(Integer.parseInt(tmp));
//            }
//            sb.append(tmp);
//        }
//        String result = sb.toString();
//
//        if(result.equals("000")){
//            result = "0";
//        }
//
//        bw.write(sb.toString());
//        bw.flush();
//        bw.close();
    }
}
