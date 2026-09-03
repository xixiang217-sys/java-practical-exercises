package day03;

import java.util.Scanner;

public class Demo02 {
    public double findS(double a){
        if (a>0)
            return a;
        else
            return -a;
    }

    public static void main(String[] args) {
        Demo02 demo02=new Demo02();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数");
        double a=sc.nextInt();
        System.out.println("绝对值为："+demo02.findS(a));
    }


}
