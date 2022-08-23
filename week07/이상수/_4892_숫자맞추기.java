package week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _4892_숫자맞추기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pass = Integer.parseInt(br.readLine());
        int idx = 1;
        StringBuilder sb;
        while (pass != 0){
            sb = new StringBuilder("");
            pass *= 3;
            if(pass % 2 ==0){
                sb.append("even");
                pass /= 2;
            }
            else{
                sb.append("odd");
                pass = (pass+1)/2;
            }
            pass *= 3;
            pass /= 9;
            System.out.println(String.format("%d. %s %d",idx++,sb.toString(),pass));
            pass = Integer.parseInt(br.readLine());
        }
    }
}
