package day06;

import java.util.Arrays;

public class Demo14 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("91 27 46 38 50");
        String[] arr=stringBuilder.toString().split(" ");
        int[]a=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           a[i]= Integer.parseInt(arr[i]);
        }
        Arrays.sort(a);
        StringBuilder arr1=new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            arr1.append(a[i]);
        }
        String x= arr1.toString();
        System.out.println(x);


    }




}
////////////代码题14：字符串数字排序
////////////需求：给定字符串 "91 27 46 38 50"，切割、转int数组、排序、重新拼接为有序字符串输出。
////////////代码题15：Date时间类使用
////////////需求：创建当前时间Date对象、指定毫秒值Date对象，获取时间毫秒值、重置时间并打印。
////////////代码题16：日期格式化与解析
////////////需求：使用SimpleDateFormat实现：日期转自定义格式字符串、字符串解析为Date对象并打印。