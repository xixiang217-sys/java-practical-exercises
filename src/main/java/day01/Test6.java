package day01;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个数");
        int a=sc.nextInt();
        if(a%5==0)
            System.out.println(a);
    }
}
