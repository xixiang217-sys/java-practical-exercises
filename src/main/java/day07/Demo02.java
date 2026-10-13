package Java_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02 {

    public static void parseDate(String dateStr) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(dateStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个日期");
        String string = scanner.next();
        try {
            parseDate(string);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println("错误");
        }
        System.out.println("成功");
    }
}
