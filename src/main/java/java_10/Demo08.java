package java_10;

import java.io.*;

public class Demo08 {
    public static void main(String[] args) {
        try (
                Reader reader = new FileReader("src/main/java/java_10/raw.txt");
                Writer writer = new FileWriter("src/main/java/java_10/clean.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);

        ) {
            String s = null;

            while ((s = bufferedReader.readLine()) != null) {
                boolean b = true;
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        b = false;
                    }
                }
                if (b) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/// /第 8 题
/// /过滤文本：读取 raw.txt，将所有包含数字的行剔除；不包含数字的行写入 clean.txt。