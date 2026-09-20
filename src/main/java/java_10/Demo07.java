package java_10;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Writer writer = new FileWriter("src/main/java/java_10/1.txt", true);) {
            for (int i = 0; i < 5; i++) {
                System.out.println("請輸入字符串");
                String s = scanner.next();
                writeout(writer, s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void writeout(Writer out, String mesg) {

        try {
            out.write(mesg);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
/// /第 7 题
/// /使用 FileWriter 向 message.txt 写入 5 行内容，循环生成：第1行、第2行……第5行。要求使用循环实现，不能手动写 5 次 write。
/// /第 8 题
/// /过滤文本：读取 raw.txt，将所有包含数字的行剔除；不包含数字的行写入 clean.txt。
