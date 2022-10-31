package week8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2920_음계 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result;
        String[] input = br.readLine().split(" ");

        result = Integer.parseInt(input[0]) == 1 ? "ascending" : Integer.parseInt(input[0]) == 8 ? "descending" : "mixed";

        if(result.equals("ascending")){
            for(int i=1; i<input.length; i++){
                int tmp = Integer.parseInt(input[i]);
                if(tmp != i+1){
                    result = "mixed";
                    break;
                }
            }
        }else if (result.equals("descending")){
            for(int i=1; i<input.length; i++){
                int tmp = Integer.parseInt(input[i]);
                if(tmp != 8-i){
                    result = "mixed";
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
