package day07;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入被除数");
        int i=scanner.nextInt();

        System.out.println("请输入除数");
        int j=scanner.nextInt();

        try{
            System.out.println("结果:"+i/j);
        }catch (ArithmeticException arithmeticException){
            System.out.println("除数不能为0");
        }

    }
}
