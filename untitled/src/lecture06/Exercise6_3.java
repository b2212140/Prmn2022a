package lecture06;

import java.util.*;

public class Exercise6_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        List<Integer> DiceList = new ArrayList<>();

        DiceList.add(random.nextInt(6)+1);
        DiceList.add(random.nextInt(6)+1);
        DiceList.add(random.nextInt(6)+1);
        DiceList.add(random.nextInt(6)+1);
        DiceList.add(random.nextInt(6)+1);
        System.out.println("さいころを5つ振りました.");
        try{
            System.out.println("何番目のさいころの値を確認しますか？");
            int index = input.nextInt();
            System.out.println(DiceList.get(index-1));
        }
        catch(IndexOutOfBoundsException index){
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
        }
        catch(InputMismatchException index){
            System.out.println("整数以外の値が入力されました。");
        }
        System.out.println("プログラムを終了します.");

    }
}
