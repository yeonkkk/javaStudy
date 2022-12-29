package backJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// 실버 4
public class _30_10610 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Character[] arr = new Character[str.length()];
        int count=0;
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            arr[i] = str.charAt(i);
            count += arr[i] - '0';
            if(arr[i] == '0') flag = true;
        }

        if(count % 3 == 0 && flag){
            StringBuilder sb = new StringBuilder();
            Arrays.sort(arr, Collections.reverseOrder());
            for(Character data  :arr){
                sb.append(data);
            }
            System.out.println(sb.toString());
        }else{
            System.out.println(-1);
        }
    }
}
