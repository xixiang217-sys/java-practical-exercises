package java_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,66));

        list.stream().filter(a->a%2!=0).forEach(a-> System.out.println(a));
    }
}
//////5. List，使用Stream筛选所有奇数并输出。
//////6. List，使用Stream把每个字符串转小写，收集结果。
//////7. List，使用Stream统计集合中元素的个数。
//////8. List，使用Stream去除重复字符串，保存到新集合。
//////9. List，使用Stream找到集合里最小的数字。
//////10. List，使用Stream过滤包含字母"a"的字符串。
//////11. List，使用Stream将每个数字+10，收集到新List。
//////12. List，使用Stream对字符串自然排序，输出