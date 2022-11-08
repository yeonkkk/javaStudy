package week5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class card1_2161 {
    public static void main(String[] args) {
        //queue
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if(N > 1) {
            Queue<Integer> cardQueue = new LinkedList<>();
            Queue<Integer> thrownQueue = new LinkedList<>();

            //cardQueue제일 위의 수를 빼서 thrownQueue에 넣는다.
            //cardQueue 에 남아있는 첫번째 수를 빼서, cardQueue의 맨 뒤로 넣는다

            //cardQueue initializing
            for (int i = 1; i <= N; i++) {
                cardQueue.add(i);
            }

            for (int q = 0; q < N; q++) {

                if (cardQueue.size() > 1) {
                    //cardQueue -> thrownQueue
                    thrownQueue.add(cardQueue.poll());

                    //cardQueue[first el -> last el]
                    cardQueue.add(cardQueue.poll());
                }
            }

            //OUT
            while (!cardQueue.isEmpty()) {
                System.out.print(thrownQueue.poll());
                System.out.print(" ");

                if (thrownQueue.isEmpty()) {
                    System.out.print(cardQueue.poll());

                }
            }
        }
        else System.out.println(1);
    }
}
