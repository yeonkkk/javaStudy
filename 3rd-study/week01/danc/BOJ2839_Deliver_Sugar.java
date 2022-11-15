import java.util.Scanner;

public class BOJ2839_Deliver_Sugar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        sc.close();
        System.out.println(deliver(kg));
    }

    static int deliver(int kg) {
        //number of bags
        int count = 0;

        while(true){
            if(kg%5 ==0){
                count +=  kg/5;
                break;
            }
            else {
                kg -= 3;
                count++;
            }
            if(kg < 0){
                return -1;
            }
        }
        return count;
    }
}
/*int ans = 0;
        int temp = 0;
        int tempkg = 0;
        int count = 0;

        //try 5kg first
        if(kg % 5 == 0){
            ans = kg/5;
        } else if (kg % 3 == 0) {
            temp = kg%5;
            if(temp >= 3 && temp%3==0) {
                temp = kg % 5;
                ans = kg/5 + temp/3;
                tempkg = temp/3;

                ans = Math.min(ans, tempkg);
            } else {
                ans = kg/3;
            }
        } else ans = -1;

        return ans;*/