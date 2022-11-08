package season2;

import java.util.Scanner;

public class SuperMario_2851 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println(Mario(arr));

    }

    private static int Mario(int[] arr) {
        Scanner sc = new Scanner(System.in);

        int temp = 1000;
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[0] == 100) return arr[0];

            sum += arr[i];
            if (Math.abs(sum - 100) <= temp) {
                temp = Math.abs(sum - 100);
                answer = sum;
            }
        }
        return answer;
    }
}

/*  //순서대로 먹어야 하는데 문제 제대로 안읽고 진행하다가 멈춤
import java.util.Arrays;
import java.util.Scanner;

public class season2.SuperMario_2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        } sc.close();

        Arrays.sort(arr);
        System.out.println(Mario(arr));

    }
    public static int Mario(int[] arr){
        //각각의 경우
        //100과 차이가 적을수록 100에 가까움
        int temp = 100;
        int value = 0;
        for (int j=0; j<arr.length-1; j++) {
            if(arr[j]==100) return arr[j];

            int elements = Math.abs(j - 100);
            if (elements <= temp) {
                temp = elements;
                value = arr[j];
            }
        }

        //합했을때 경우
        int sumTemp = 1000;
        for(int j=0; j<arr.length-1;j++) {
            int sumOfElements = Math.abs((arr[j] + arr[arr.length-j-1])-100);
            if(sumOfElements == 100) return sumOfElements;

            if(sumOfElements <= temp) {
                sumTemp = sumOfElements;
            }
        }

        //100과 차이 비교
        if(Math.abs(value-100) == Math.abs(sumTemp-100)){
            return Math.max(value, sumTemp);
        } else {
            if(Math.abs(value-100) > Math.abs(sumTemp-100)) {
                return sumTemp;
            } else {
                return value;
            }
        }
    }
}
*/