package java_09;

import java.io.*;

public class Demo07 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("d:/source.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream("d:/target.jpg");
        int count;
        byte[] bytes=new byte[1024];
        while ((count=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,count);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
//7.利用字节流完成文件复制，将 d:/source.jpg 复制到 d:/target.jpg。
