package java_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo04 {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student("aa",20));
        list.add(new Student("bb",17));
        list.add(new Student("cc",22));
        list.add(new Student("dd",19));

        list.sort(Comparator.comparingInt(Student::getAge));
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
//4. 准备存有多个Student对象的List集合，按照学生年龄升序排序输出。
