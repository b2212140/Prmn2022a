package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num;
        ArrayList<String> numbers = new ArrayList<>();
        for(int i=0;i<2;i++){
            System.out.println((i+1)+"つ目の整数を入力してください:");
            numbers.add(input.nextLine());

        }


    }
}
