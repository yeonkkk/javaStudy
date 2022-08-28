package week8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1672_DNA해독 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String str = br.readLine();

        List<Character> list = new ArrayList<>(List.of('A','G','C','T'));
        Map<Character,Character[]> map = new HashMap<>();
        map.put('A',new Character[]{'A','C','A','G'});
        map.put('G',new Character[]{'C','G','T','A'});
        map.put('C',new Character[]{'A','T','C','G'});
        map.put('T',new Character[]{'G','A','G','T'});

        Character result = str.charAt(str.length()-1);
        for(int i=count-1; i>=0; i--){
            Character tmp = map.get(str.charAt(i))[list.indexOf(result)];
            result = tmp;
        }

        System.out.println(result);
    }
}
