package day01;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args){
        System.out.println("请输入一个数");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if (a>100||a<0)
            System.out.println("数都输错了");
        else if (a>90)
            System.out.println("优秀");
        else if (a>80&&a<90)
            System.out.println("良好");
        else if (a>70&&a<80)
            System.out.println("中等");
        else if (a>=60&&a<70)
            System.out.println("及格");
        else
            System.out.println("不及格");


    }
}
