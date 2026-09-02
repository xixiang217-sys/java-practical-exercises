package day02;

import java.util.Random;

public class Demo07 {
    public static void main(String[] args){
        int[]arr=new int[6];
        Random random=new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(10);
        }
        int number=0;
       for (int i=0;i<arr.length;i++){
           number=number*10+arr[i];
       }
       System.out.println(number);
    }
}
