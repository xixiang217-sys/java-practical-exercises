package Java_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("苹果");
        list.add("香蕉");
        list.add("葡萄");
        list.add("芒果");

        Iterator<String> q = list.iterator();
        while (q.hasNext()) {
            System.out.println(q.next());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String string : list) {
            System.out.println(string);
        }

        //：苹果、香蕉、葡萄、芒果。
    }
}
