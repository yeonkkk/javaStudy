import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
// 이진 탐색

public class BOJ10816_NumCard2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer bf = new StringBuffer();
        StringTokenizer tk;

        int total = Integer.parseInt(br.readLine());
        long[] numCards = new long[total];
        tk = new StringTokenizer(br.readLine());

        for(int i=0; i<total; i++){
            numCards[i] = Long.parseLong(tk.nextToken());
        }Arrays.sort(numCards);

        int totalToFind = Integer.parseInt(br.readLine());
        long[] numCardsToFine = new long[totalToFind];
        tk = new StringTokenizer(br.readLine());

        for(int i=0; i<totalToFind; i++){
            long targetNum = Long.parseLong(tk.nextToken());
            bf.append(card(targetNum, numCards)).append(" ");
        }
        System.out.println(bf.toString());
    }

    //linear search causes timeout.
    // Binary search
    static String card(long targetNum, long[] numCards) {
        int firstIdxCounts;
        int lastIdxCounts;
        int startIdx = 0;
        int midIdx;
        int lastIdx = numCards.length;
        /*for(int i=0; i<numCards.length; i++){
            if(targetNum == numCards[i]) {
                counts++;
            }
        }*/
        while(startIdx < lastIdx){
            midIdx = (startIdx + lastIdx) / 2;

            //target is smaller than mid -> change last index
            if (targetNum <= numCards[midIdx]) {
                lastIdx = midIdx;
            }
            //target is bigger than mid -> place first idx after mid
            else {
                startIdx = midIdx+1;
            }
        } firstIdxCounts = startIdx;

        startIdx = 0;
        lastIdx = numCards.length;

        while(startIdx < lastIdx){
            midIdx = (startIdx + lastIdx) / 2;

            //target is smaller than mid -> change last index
            if (targetNum < numCards[midIdx]) {
                lastIdx = midIdx;
            }
            //target is bigger than mid -> place first idx after mid
            else {
                startIdx = midIdx+1;
            }
        } lastIdxCounts = lastIdx;

        return String.valueOf(Math.abs(firstIdxCounts-lastIdxCounts));
    }
}
