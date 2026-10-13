package java_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo09 {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student("aa",18));
        list.add(new Student("bb",20));
        list.add(new Student("cc",18));
        list.add(new Student("dd",20));
        list.add(new Student("ee",17));

        Map<Integer, List<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getAge));

        collect.forEach((age,students)->{
            System.out.println("年龄"+age+"："+students);
        });
    }
}
//9. 准备一个存储Student的List集合，利用Map的特性，按学生年龄进行分组，相同年龄的学生放到一组。
