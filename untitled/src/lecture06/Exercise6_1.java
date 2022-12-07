package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("小数値を入力してください:");
            Double n = input.nextDouble();
            System.out.println(n);
        }
        catch (InputMismatchException n){
            System.out.println("エラー");
        }
    }
}
