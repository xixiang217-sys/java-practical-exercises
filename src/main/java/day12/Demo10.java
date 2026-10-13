package java_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo10 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("ad","d","d","d","deee","ddef"));

        list.stream().filter(a->a.contains("a"));
    }
}
////////////10. List，使用Stream过滤包含字母"a"的字符串。
////////////11. List，使用Stream将每个数字+10，收集到新List。
////////////12. List，使用Stream对字