package java_09;

import java.io.*;

public class Demo05 {
    public static void main(String[] args) throws IOException {
        File file=new File("d:/test.txt");
        InputStream inputStream=new FileInputStream(file);
        int count;
        byte[] bytes=new byte[1024];
        while ((count=inputStream.read(bytes))!=-1){
            for (byte b:bytes){
                System.out.print(b);
            }

            String s=new String(bytes,0,count);
            System.out.println(s);

            System.out.println(count);
        }
        inputStream.close();
    }
}
//5.编写代码，使用字节流读取 d:/test.txt 文件内容，将读取到的字节打印到控制台。
//6.使用 FileOutputStream 字节输出流，向 d:/data.txt 写入字符串 "hello java io"。
//7.利用字节流完成文件复制，将 d:/source.jpg 复制到 d:/target.jpg。
//8.判断文件大小，如果大于 1024 字节，使用字节流复制文件，否则提示文件过小。