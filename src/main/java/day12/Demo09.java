package java_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo09 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,66));
        Integer i = list.stream().min(Integer::compareTo).orElse(-1);

    }
}
//////////9. List，使用Stream找到集合里最小的数字。
//////////10. List，使用Stream过滤包含字母"a"的字符串。
//////////11. List，使用Stream将每个数字+10，收集到新List。
//////////12. List，使用Stream对字