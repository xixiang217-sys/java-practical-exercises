package Java_08;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("苹果","香蕉","橙子","葡萄","芒果"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String string : list) {
            System.out.println(string);
        }
    }
}
//"苹果","香蕉","橙子","葡萄","芒果"
