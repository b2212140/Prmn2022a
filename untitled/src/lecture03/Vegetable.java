package lecture03;

import java.util.Scanner;

public class Vegetable {
    String name;
    int value;
    Vegetable(String name,int value){
        this.name = name;
        this.value = value;
    }
    Scanner input = new Scanner(System.in);
    void print(){
        System.out.println(name+"は"+value+"円");
    }
}
