package java_09;

import java.io.File;
import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\java_09");
        File file1 = file.getAbsoluteFile();
        if (file1.isFile()) {
            return;
        } else if (file1.isDirectory()) {
            File[] f = file1.listFiles();
//            for (int i = 0; i < f.length; i++) {
//                if (f[i].getName().endsWith(".txt")){
//                    System.out.println(f[i].getName());
//                }
//
//            }
            for (File file2 : f) {
                if (file2.getName().endsWith(".txt")) {
                    System.out.println(file2.getName());
                }
            }
        }
    }
}
//1.编写递归方法，输入一个整数n，计算1到n所有整数的累加和，
//2.使用递归遍历指定文件夹，输出该目录下所有后缀为.txt的文件名称，利用File类实现目录判断。
//3.写递归函数统计一个文件夹内所有文件的总大小，File类区分文件和子目录，递归累加字节大小。
//4.递归反转字符串，接收控制台输入字符串，将反转后的字符串用File类写入reverse.txt，文件不存在则新建。