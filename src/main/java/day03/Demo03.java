package day03;

import java.util.Scanner;

public class Demo03 {
    public static int siShe(double number){
        double a=  number-(int)(number);
        if(a>=0.5){
            return (int)(number+0.5);}
        else {
            return (int) number;
        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个数");
        double a=scanner.nextDouble();
        System.out.println(siShe(a));

    }
}
