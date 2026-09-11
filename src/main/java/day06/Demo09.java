package day06;

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入字符串");
        StringBuilder stringBuilder=new StringBuilder(scanner.next());
        System.out.println(stringBuilder.reverse());

    }
}
//////代码题9：StringBuilder反转字符串
//////需求：键盘录入字符串，使用StringBuilder的reverse方法实现反转输出。