package java_10;

import java.io.FileReader;
import java.io.Reader;

public class Demo06 {
    public static void main(String[] args) {
        try (
                Reader reader=new FileReader("src/main/java/java_10/1.txt");
                ){
            char[]chars=new char[1024];
            int count = 0;
            int read = reader.read(chars);
            for (char c:chars){
                if (c=='a'||c=='A'){
                    count++;
                }
            }
            System.out.println(count);
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
/// /第 6 题
/// /使用 FileReader 读取文件，统计文件中**英文字母 a（不区分大小写）**出现的总次数，控制台输出统计结果。
/// /第 7 题
/// /使用 FileWriter 向 message.txt 写入 5 行内容，循环生成：第1行、第2行……第5行。要求使用循环实现，不能手动写 5 次 write。
/// /第 8 题
/// /过滤文本：读取 raw.txt，将所有包含数字的行剔除；不包含数字的行写入 clean.txt。
