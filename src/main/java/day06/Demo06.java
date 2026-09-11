package day06;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入字符串");
        String string=new String(scanner.next());
        for (int i = string.length()-1; i >=0 ; i--) {
            System.out.println(string.charAt(i));
        }
    }
}
////代码题6：普通方法实现字符串反转
////需求：键盘录入字符串，通过循环遍历拼接实现字符串反转输出。