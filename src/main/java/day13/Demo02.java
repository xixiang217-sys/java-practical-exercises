package java_13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo02 {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student("aa",18));
        list.add(new Student("bb",20));
        list.add(new Student("cc",17));
        list.add(new Student("dd",22));
        list.add(new Student("ee",19));

        List<Student> collect = list.stream().filter(student -> student.getAge() > 18).collect(Collectors.toList());
        for (Student student : collect) {
            System.out.println(student);
        }
    }
}
//2. 基于上一题的Student集合，筛选出年龄大于18的学生，保存到新集合中。
