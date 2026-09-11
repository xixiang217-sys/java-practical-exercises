package day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo16 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date now = new Date();
        String str = sdf.format(now);
        System.out.println(str);
        Date parsed = sdf.parse("2026-09-10 14:30:00");
        System.out.println(parsed);

    }
}
////////////////代码题16：日期格式化与解析
////////////////需求：使用SimpleDateFormat实现：日期转自定义格式字符串、字符串解析为Date对象并打印。