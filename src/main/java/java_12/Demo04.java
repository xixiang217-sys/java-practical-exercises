package java_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Demo04 {
    public static void main(String[] args) {

        List<String>list=new ArrayList<>(Arrays.asList("d","d","d","d","deee","ddef"));
        List<String> collect = list.stream().filter(a -> a.length() > 3).collect(Collectors.toList());
    }
}
////4. List，使用Stream过滤出长度大于3的字符串，收集成新List。
////5. List，使用Stream筛选所有奇数并输出。
////6. List，使用Stream把每个字符串转小写，收集结果。
////7. List，使用Stream统计集合中元素的个数。
////8. List，使用Stream去除重复字符串，保存到新集合。
////9. List，使用Stream找到集合里最小的数字。
////10. List，使用Stream过滤包含字母"a"的字符串。
////11. List，使用Stream将每个数字+10，收集到新List。
////12. List，使用Stream对字符串自然排序，输出排序后的内容。