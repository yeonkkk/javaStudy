package week8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class _5622_다이얼 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 0;

        List<String> list = new ArrayList<>(List.of("","","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"));

        for(int i=0; i<str.length(); i++){
            char tmp = str.charAt(i);

            for(int j=3; j<list.size(); j++){
                if(list.get(j).contains(String.valueOf(tmp))) {
                    result += j;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
