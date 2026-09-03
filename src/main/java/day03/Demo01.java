package day03;

import java.util.Scanner;

public class Demo01 {
    public static double findMini(double a,double b){
        if (a>b)
            return b;
        else
            return a;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入2个数");
        double a=sc.nextInt();
        double b=sc.nextInt();
        System.out.println(findMini(a,b));


    }

}
