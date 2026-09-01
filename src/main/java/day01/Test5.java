package day01;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个数");
        int a=sc.nextInt();
        System.out.println("输入一个数");
        int b= sc.nextInt();
        System.out.println("输入一个数");
        int c = sc.nextInt();

        if(a<b||a<c)
            System.out.println("最小的数为"+a);
        else if (b<a||b<c)
            System.out.println("最小的数为"+b);
        else if(c<b||c<a)
            System.out.println("最小的数为"+c);


    }
}

