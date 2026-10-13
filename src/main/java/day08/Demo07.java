package Java_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo07 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(Set.of("Java", "MySQL", "Vue", "Spring"));
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println(list.get(1));
    }
}
//第 7 题
//把 HashSet 转为 ArrayList。
//Set 集合：{"Java","MySQL","Vue","Spring"}
//转成 List 后，获取索引 1 的元素并打印。