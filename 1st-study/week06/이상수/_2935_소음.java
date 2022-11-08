package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2935_소음 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        String what = br.readLine();
        String second = br.readLine();
        StringBuilder sb = null;

        if(what.equals("*")){
            sb = new StringBuilder(first);
            sb.append(second.substring(1,second.length()));
        }else{
            if(first.length() == second.length()){
                sb= new StringBuilder(first);
                sb.replace(0,1,"2");
            }else{
                int dif = Math.abs(first.length() - second.length());
                String temp = first.length() > second.length() ? first : second;
                sb = new StringBuilder(temp);
                sb.replace(dif,dif+1,"1");
            }
        }
        System.out.println(sb);
    }
}
