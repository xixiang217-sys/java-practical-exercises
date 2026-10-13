package java_09;

import java.io.*;

public class Demo08 {
    public static void main(String[] args) throws IOException {
        File file=new File("d:/source.jpg");
        if (file.length()>1024){
            FileInputStream fileInputStream=new FileInputStream(file);
            FileOutputStream fileOutputStream=new FileOutputStream("d:/target.jpg");
            int count;
            byte[] bytes=new byte[1024];
            while ((count=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,count);
            }
            fileInputStream.close();
            fileOutputStream.close();
            System.out.println("文件大小为"+file.length()+"字节，复制完成");
        }else {
            System.out.println("文件过小");
        }
    }
}
//8.判断文件大小，如果大于 1024 字节，使用字节流复制文件，否则提示文件过小。
