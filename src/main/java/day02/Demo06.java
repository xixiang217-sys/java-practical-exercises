package day02;

import java.util.Random;

public class Demo06 {
    public static void main(String[] args){
        int[]arr=new int[6];
        Random random=new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
    System.out.println(sum);


    }
}
