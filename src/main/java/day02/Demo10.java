package day02;

import java.util.Random;

public class Demo10 {
    public static void main(String[] args){
        Random random=new Random();
        int []arr=new int[6];
        boolean count=true;

        for (int i=0;i<arr.length;i++){
            int temp=random.nextInt(33)+1;
            for (int j=0;j<i;j++){
                if (arr[j]==temp)
                    count=false;
            }
            if (count)
                arr[i]=temp;
        }//生成符合的数组

        //冒泡排序
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tep=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tep;
                }
            }
        }

        int randomnumber=random.nextInt(16)+1;   //蓝球

        System.out.print("红号:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("蓝号："+randomnumber);




    }
}
