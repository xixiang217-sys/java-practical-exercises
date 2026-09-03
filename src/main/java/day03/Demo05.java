package day03;

import java.util.Scanner;

public class Demo05 {

        public void plan(int day) {
            if (day == 1) {
                System.out.println("跑步");
            } else if (day == 2) {
                System.out.println("游泳");
            } else if (day == 3) {
                System.out.println("慢走");
            } else if (day == 4) {
                System.out.println("动感单车");
            } else if (day == 5) {
                System.out.println("拳击");
            } else if (day == 6) {
                System.out.println("爬山");
            } else if (day == 7) {
                System.out.println("好好吃一顿");
            } else {
                System.out.println("输入的日期不正确");
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
