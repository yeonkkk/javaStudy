import java.io.*;
import java.util.HashMap;
import java.util.Map;
//해시맵
public class BOJ11652_Card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long minKey = 1;
        int checkMax = 0;
        HashMap<Long, Integer> hashMap = new HashMap<>();

        for(int i=0; i<N; i++){
            long num = Long.parseLong(br.readLine());
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);

            if(hashMap.get(num) > checkMax){
                checkMax = hashMap.get(num);
                minKey = num;
            } else if(hashMap.get(num) == checkMax ) {
                minKey = Math.min(minKey, num);
            }
        }
        bw.write(String.valueOf(minKey));
        bw.flush();
        bw.close();
        br.close();
    }
}
/*//getting max count
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            int addup;
            if (hashMap.containsKey(num)) {
                addup = hashMap.get(num) + 1;
                hashMap.put(num, addup); //if the key already exists, value++
            } else {
                hashMap.put(num, counts);
            }
        }


        HashMap<Long, Integer> mapToCompare = new HashMap<>();

        //get key from value(max count)
        for (Map.Entry<Long, Integer> entry : hashMap.entrySet()) {
            //updating max value(counts)
            if (checkMaxCounts <= entry.getValue()) {
                mapToCompare.put(entry.getKey(), entry.getValue()); //max val into new map
            }
        }

        long minKey = 0;
        long minVal = 0;
        for (Map.Entry<Long, Integer> entry : mapToCompare.entrySet()) {
            if (minVal == 0) {
                minVal = entry.getValue();
                minKey = entry.getKey();
                continue;
            }
            if (minVal < entry.getValue()) {
                minKey = entry.getKey();
            } else if (minVal == entry.getValue()) {
                //minKey = minKey.min(entry.getKey());
                minKey = minKey > entry.getKey() ? entry.getKey() : minKey;
            }
        }*/