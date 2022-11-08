package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Souvenir_12873 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int participants = Integer.parseInt(bf.readLine());
        bf.close();

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= participants; i++) {
            list.add(i);
        }
        games(list, participants);
    }

    public static void games(List<Integer> list, int participants) {

        int bf = 0;
        for (int i = 1; i < participants; i++) {
            int num = (bf + calc(i, list.size()) - 1) % list.size();
            if (num < 0) {
                num += list.size();
            }
            list.remove(bf=num);
        }
        System.out.println(list.get(0));
    }

    public static int calc(int i, int size) {
        int temp = i;
        temp *= i;
        temp %= size;
        temp *= i;
        return temp % size;
    }
}
