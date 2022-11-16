package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[2];
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<2;i++){
            System.out.println((i+1)+"つ目の整数を入力してください:");
            strings.add(input.nextLine());
            num[i]= Integer.parseInt(strings.get(i));
        }
        System.out.println(num[0]+"+"+num[1]+"="+(num[0]+num[1]));

    }
}
