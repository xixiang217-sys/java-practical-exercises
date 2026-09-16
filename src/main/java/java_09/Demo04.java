package java_09;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        File file = new File("src\\main\\java\\java_09\\reverse.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(rever(s));
        fileWriter.flush();
        fileWriter.close();
    }

    public static String rever(String string) {
        if (string.length() == 0) {
            return string;
        }
        return rever(string.substring(1)) + string.charAt(0);
    }
}
/// /4.递归反转字符串，接收控制台输入字符串，将反转后的字符串用File类写入reverse.txt，文件不存在则新建。