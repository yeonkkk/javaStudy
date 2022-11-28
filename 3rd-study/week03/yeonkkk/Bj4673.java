/**
 * BOJ 4673 셀프 넘버
 */

public class Bj4673 {
    private final static int LIMIT = 10000;

    public static void main(String[] args) {
        boolean[] check = new boolean[LIMIT + 1];

        for (int i = 1; i < LIMIT; i++) {
            d(check, i);
        }

        for (int i = 1; i <= LIMIT; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    public static void d(boolean[] check, int n) {
        int result = n;

        while (n != 0) {
            result += (n % 10);
            n /= 10;
        }

        if (result <= LIMIT) check[result] = true;
    }
}
