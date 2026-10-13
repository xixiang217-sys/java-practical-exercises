package java_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo10 {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student("aa",18));
        list.add(new Student("bb",15));
        list.add(new Student("cc",17));
        list.add(new Student("dd",14));

        removeStudent(list);

        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static void removeStudent(List<Student>list){
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getAge()<16){
                iterator.remove();
            }
        }
    }
}
//10. 创建一个工具方法，接收List集合作为参数，移除集合中年龄小于16的所有学生对象。
