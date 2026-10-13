package java_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo12 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("adadagfggd","d","d","d","qqdeee","ddef"));
        list.stream().sorted().forEach(a-> System.out.println(a));
    }
}
//List，使用Stream对字符串自然排序，输出排序后的内容。