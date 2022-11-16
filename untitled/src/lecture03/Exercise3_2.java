package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        int line= input.nextInt();

        input.nextLine();

        ArrayList<String> lists = new ArrayList<>();
        for(int i=0;i<line;i++){
            System.out.println((i+1)+"行目:");
            lists.add(input.nextLine());
        }

        System.out.println("入力した文字列:");

        int c =0;
        for(String list : lists){
            System.out.println("["+c+"]"+list);
            c =c+1;
        }
    }

}
