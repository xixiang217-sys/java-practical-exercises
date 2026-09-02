package day02;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Demo09 {
    public  static void main(String[] args){
        int[] arr=new int[10];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入一个数");
            arr[i]=scanner.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("平均成绩为："+sum/arr.length+"分");

    }

}
