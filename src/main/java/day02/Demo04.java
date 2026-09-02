package day02;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args){
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<6;i++){
            System.out.println("输入一个数赋值");
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<6;i++){
            System.out.print(arr[i]+" ");
        }




    }
}
