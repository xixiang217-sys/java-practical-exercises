package Java_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Demo06 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 8, 1, 5, 9, 9, 9));
        HashSet<Integer> hashSet = new HashSet<>(list);

        for (Integer hashset : hashSet) {
            int count = 0;
            for (Integer lsit : list) {
                if (lsit.equals(hashset)) {
                    count++;
                }
            }
            System.out.println(hashset + "的个数为" + count + "个");
        }
    }
}
//第 6 题
//List 集合：[5,1,8,1,5,9,9,9]
//编写代码，统计每个数字出现的次数（提示：可用 Set 拿到不重复元素，再遍历 list 计数）