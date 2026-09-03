package day03;

import java.util.Scanner;

public class Demo12 {



    public static void aver(double[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <a.length-i-1 ; j++) {//冒泡排序
                if (a[j]<a[j+1]){//大前小后
                    double temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        double sum=0;
        for (int j = 1; j <a.length-1 ; j++) {
            sum+=a[j];
        }
        System.out.println((int) sum/4);
    }




    public static void main(String[] args) {
        System.out.println("请输入6次的打分");
        Scanner scanner=new Scanner(System.in);
        double[]arr=new double[6];
        for (int i = 0; i <6; i++) {
            arr[i]=scanner.nextDouble();
        }
        aver(arr);

    }

}
