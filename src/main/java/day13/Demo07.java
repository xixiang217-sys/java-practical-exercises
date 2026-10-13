package java_13;

import java.util.ArrayList;
import java.util.List;

public class Demo07 {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student("aa",18));
        list.add(new Student("bb",20));
        list.add(new Student("cc",17));
        list.add(new Student("dd",22));
        list.add(new Student("ee",19));

        long count = list.stream().count();
        System.out.println("学生总人数："+count);
    }
}
//7. 把存有Student对象的List转为Stream流，统计集合中学生的总人数。
