package java_10;

import java.io.*;

public class Demo05 {
    public static void main(String[] args) {
        try (
                Writer writer = new FileWriter("src/main/java/java_10/2.txt", true);
                Reader reader = new FileReader("src/main/java/java_10/test.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                BufferedReader bufferedReader=new BufferedReader(reader);
        ) {
            char[] chars=new char[1024];
            int count;
            while ((count=bufferedReader.read(chars))!=-1){
                bufferedWriter.write(chars,0,count);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
/// /第 5 题【缓冲流实现文本文件复制【重点】】
/// /利用 BufferedReader + BufferedWriter，复制一个文本文件（只能复制 txt 等文本，不能复制图片视频）。
/// /第 6 题
/// /使用 FileReader 读取文件，统计文件中**英文字母 a（不区分大小写）**出现的总次数，控制台输出统计结果。
/// /第 7 题
/// /使用 FileWriter 向 message.txt 写入 5 行内容，循环生成：第1行、第2行……第5行。要求使用循环实现，不能手动写 5 次 write。
/// /第 8 题
/// /过滤文本：读取 raw.txt，将所有包含数字的行剔除；不包含数字的行写入 clean.txt。