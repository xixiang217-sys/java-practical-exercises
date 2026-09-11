package day06;

public class Demo12 {
    public static void main(String[] args) {
        double  a=1.5;
        double b=2.1;
        System.out.println(Math.abs(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
        System.out.println(Math.round(a));
        System.out.println(Math.random());
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));


    }

}
//////////代码题12：Math常用方法测试
//////////需求：代码测试并打印：绝对值、向上取整、向下取整、四舍五入、最大值、最小值、随机数。
//////////代码题13：计算代码执行耗时
//////////需求：循环输出1~1000，使用System.currentTimeMillis计算程序运行耗时并打印。
//////////代码题14：字符串数字排序
//////////需求：给定字符串 "91 27 46 38 50"，切割、转int数组、排序、重新拼接为有序字符串输出。
//////////代码题15：Date时间类使用
//////////需求：创建当前时间Date对象、指定毫秒值Date对象，获取时间毫秒值、重置时间并打印。
//////////代码题16：日期格式化与解析
//////////需求：使用SimpleDateFormat实现：日期转自定义格式字符串、字符串解析为Date对象并打印。