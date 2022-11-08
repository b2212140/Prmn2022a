package lecture02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Human {
    String name;
    int age;
    Human(String name , int age){
        this.name = name;
        this.age = age;
    }

    void print(){
        String student=" ";
        if(age<=18){
            student="生徒";
        } else if (age<=22) {
            student="学生";
        }


        System.out.println(student+":"+name+" "+age+"歳です。");
    }
}
