package Java_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo08 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 9, 10));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
//第 8 题
//有一个存储 Integer 的 List：[2,4,6,8,9,10]
//要求：删除集合中所有奇数，输出最终 list。