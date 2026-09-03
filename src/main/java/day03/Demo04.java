package day03;

import java.util.Scanner;

public class Demo04 {
    public void  plan(int day){
        switch (day){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;

        }
    }

    public static void main(String[] args) {
        System.out.println("今天是周几");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        Demo04 demo04=new Demo04();
        System.out.print("今天的减肥运动是：");
        demo04.plan(a);

    }


}
