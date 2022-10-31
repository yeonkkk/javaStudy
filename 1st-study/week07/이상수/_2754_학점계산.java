package week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2754_학점계산 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double result = 0;
        String str = st.nextToken();
        if(str.equals("F")){
        }else{
            result = 'E' - str.charAt(0);

            String alpha = String.valueOf(str.charAt(1));
            double temp = alpha.equals("+") == true ? 0.3 : (alpha.equals("0") == true ? 0 : -0.3) ;

            result += temp;
        }


        System.out.println(result);
    }
}
