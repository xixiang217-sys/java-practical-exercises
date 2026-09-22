package java_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo11 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,66));
        List<Integer> collect = list.stream().map(a -> a + 10).collect(Collectors.toList());
    }
}
//////////////11. List，使用Stream将每个数字+10，收集到新List。
//////////////12. List，使用S