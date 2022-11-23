package season2;

import java.io.*;

public class Good_License_Plate_1871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer bf = new StringBuffer();

        int nums = Integer.parseInt(br.readLine());
        String[] arr = new String[nums];
        for (int i = 0; i < nums; i++) {
            String plate = br.readLine();
            bw.write(licensePlateIdentifier(plate));
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static String licensePlateIdentifier(String plate) {
        String[] temp = plate.split("-");
        int headCount = 0;
        int tailCount = 0;

        for (int i = 0; i < temp.length; i++) {
            //Head
            if (i == 0) {
                for (int j = 0; j < temp[i].length(); j++) {
                    headCount = calculator(temp[i]);
                }
            }
            //Tail
            else {
                tailCount = Integer.parseInt(temp[i]);
            }
        }
        return Math.abs(headCount - tailCount) <= 100 ? "nice" : "not nice";
    }

    private static int calculator(String head) {
        int headCount = 0;
        int index = 2;
        //Alphabet 65 -90
        for (int t = 0; t < head.length(); t++) {
            for (int i = 65; i <= 90; i++) {
                if(head.charAt(t) == i) {
                    headCount += ( (i-65) * Math.pow(26, index));
                    index--;
                    break;
                }
            }
        }
        return headCount;
    }
}
