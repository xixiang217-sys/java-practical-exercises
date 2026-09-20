package java_09;

import java.io.*;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("d:/data.txt");
        String s="hello java io";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();
    }
}
//6.使用 FileOutputStream 字节输出流，向 d:/data.txt 写入字符串 "hello java io"。
