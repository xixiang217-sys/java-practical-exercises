package day03;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数据");
        int number=scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");

    }
}
