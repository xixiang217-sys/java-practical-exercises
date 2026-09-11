package day06;

import java.util.Date;

public class Demo15 {
    public static void main(String[] args) {
        Date date=new Date();
        date.setTime(100000L);
        System.out.println(date.toString());
        System.out.println(date.getTime());
        date.setTime(10000000000L);
        System.out.println(date.getTime());
        System.out.println(date.toString());


    }
}
//////////////代码题15：Date时间类使用
//////////////需求：创建当前时间Date对象、指定毫秒值Date对象，获取时间毫秒值、重置时间并打印。
//////////////代码题16：日期格式化与解析
//////////////需求：使用SimpleDateFormat实现：日期转自定义格式字符串、字符串解析为Date对象并打印。