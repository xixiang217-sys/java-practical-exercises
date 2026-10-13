package java_09;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        File file=new File("src\\main\\java\\java_09");
        q(file);
    }
    public static void q(File file){
        int sum=0;
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()){
            sum+=files[i].length();
            }
            else {
                q(files[i]);
            }
        }
        System.out.println(sum);
    }

}
////3.写递归函数统计一个文件夹内所有文件的总大小，File类区分文件和子目录，递归累加字节大小。
////4.递归反转字符串，接收控制台输入字符串，将反转后的字符串用File类写入reverse.txt，文件不存在则新建。