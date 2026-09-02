package day02;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个5位数");
        int number=sc.nextInt();
        int [] arr=new int[5];
        int count=5;
        for (int i=arr.length-1;i>=0;i--){
            arr[i]=number%10;
            number=number/10;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
