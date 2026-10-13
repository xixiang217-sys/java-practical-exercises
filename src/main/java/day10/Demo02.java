package java_10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.Buffer;

public class Demo02 {
    public static void main(String[] args) {
        try (
                Reader reader=new FileReader("src/main/java/java_10/1.txt");
                BufferedReader buffer=new BufferedReader(reader);
                ) {
            char[]chars=new char[1024];
            int count;
            while ((count= buffer.read(chars))!=-1){
                System.out.println(new String(chars).substring(0,count));
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

}
/// /第 2 题【FileReader 字符数组缓冲读取】
/// /使用 FileReader + char [] 数组批量读取文本文件，输出内容到控制台。对比第 1 题，体会数组批量读取优势。
/// /第 3 题【FileWriter 写入文件】
/// /在项目目录创建 test.txt，写入字符串：Hello IO，字符流写入测试；
/// /要求：写完后换行；如果文件已存在，覆盖原有内容。
/// /第 4 题【FileWriter 追加写入】
/// /沿用上面的 test.txt，在文件末尾追加一行文字：追加写入这一行，不覆盖原有内容。
/// /第 5 题【缓冲流实现文本文件复制【重点】】
/// /利用 BufferedReader + BufferedWriter，复制一个文本文件（只能复制 txt 等文本，不能复制图片视频）。
/// /第 6 题
/// /使用 FileReader 读取文件，统计文件中**英文字母 a（不区分大小写）**出现的总次数，控制台输出统计结果。
/// /第 7 题
/// /使用 FileWriter 向 message.txt 写入 5 行内容，循环生成：第1行、第2行……第5行。要求使用循环实现，不能手动写 5 次 write。
/// /第 8 题
/// /过滤文本：读取 raw.txt，将所有包含数字的行剔除；不包含数字的行写入 clean.txt。