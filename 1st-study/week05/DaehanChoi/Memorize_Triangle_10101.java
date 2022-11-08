package week5;

import java.util.Scanner;

public class Memorize_Triangle_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edge1 = sc.nextInt();
        int edge2 = sc.nextInt();
        int edge3 = sc.nextInt();
        sc.close();

        int Sum = edge1+edge2+edge3;

        if(edge1==60&&edge2==60&&edge3==60) System.out.println("Equilateral");
        else if(Sum==180 && ((edge1==edge2)||(edge1==edge3)||(edge2==edge3)))
        {
            System.out.println("Isosceles");
        }
        else if(Sum==180 && ((edge1!=edge2)&&(edge2!=edge3)))
        {
            System.out.println("Scalene");
        } else System.out.println("Error");

    }
}
