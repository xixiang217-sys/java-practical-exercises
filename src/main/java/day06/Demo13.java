package day06;

public class Demo13 {
    public static void main(String[] args) {
        System.out.println("开始的时间是："+System.currentTimeMillis());
        double fast=System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        double last=System.currentTimeMillis();
        System.out.println("结束的时间是："+System.currentTimeMillis());
        System.out.println("运行的时间是："+Math.abs((fast-last)));

    }
}
//////////代码题13：计算代码执行耗时
//////////需求：循环输出1~1000，使用System.currentTimeMillis计算程序运行耗时并打印。
//////////代码题14：字符串数字排序
//////////需求：给定字符串 "91 27 46 38 50"，切割、转int数组、排序、重新拼接为有序字符串输出。
//////////代码题15：Date时间类使用
//////////需求：创建当前时间Date对象、指定毫秒值Date对象，获取时间毫秒值、重置时间并打印。
//////////代码题16：日期格式化与解析
//////////需求：使用SimpleDateFormat实现：日期转自定义格式字符串、字符串解析为Date对象并打印。