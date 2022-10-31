package week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _9243_파일완전삭제 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String trash = br.readLine();
        String origin = br.readLine();
        String after = br.readLine();

        int repeat = Integer.parseInt(trash)%2;

        if(repeat != 0){
            for(int i=0; i<origin.length(); i++){
                if(repeat != 0 && origin.charAt(i) == after.charAt(i)){
                    System.out.println("Deletion failed");
                    break;
                }

                if(i == origin.length()-1){
                    System.out.println("Deletion succeeded");
                }
            }
        }else{
            System.out.println(origin.equals(after) == true ? "Deletion succeeded" : "Deletion failed");
        }

    }
}
