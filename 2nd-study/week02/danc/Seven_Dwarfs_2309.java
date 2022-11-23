package season2;

import java.util.Arrays;
import java.util.Scanner;

public class Seven_Dwarfs_2309 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //System.out.println(Arrays.toString(arr));
        int totals = Arrays.stream(arr).sum();
        int[] ans = {};
        int sum = 0;

        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                //this is a key approach
                if (totals - (arr[i] + arr[j]) == 100) {
                    //make that 2 elements to zero
                    arr[i] = 0;
                    arr[j] = 0;
                    break outer;
                }
            }
        }
        //and then remove 0 from the array.
        //this can be done because every dwarfs' heights are natural nums
        ans = Arrays.stream(arr).filter(n -> n != 0).toArray();
        // sort and print out
        Arrays.stream(ans).sorted().forEach(System.out::println);
    }
}

