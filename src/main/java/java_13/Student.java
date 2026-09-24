package java_13;

import java.util.Objects;

public class Student {
    private  String name;
    public Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
////13. 9月23
////1. 创建Student类，包含姓名、年龄属性，生成5个学生对象存入ArrayList，遍历输出所有学生信息。
////2. 基于上一题的Student集合，筛选出年龄大于18的学生，保存到新集合中。
////3. 创建2个Student对象，属性完全相同，将它们放入HashSet，观察结果并重写equals和hashCode方法实现去重。
////4. 准备存有多个Student对象的List集合，按照学生年龄升序排序输出。
////5. 使用HashMap存储学生编号和Student对象，编号为key，对象为value，完成添加、根据编号查询学生、删除学生操作。
////6. 定义Car类，属性：品牌、价格，创建多个Car对象存入List，找出价格最高的汽车对象。
////7. 把存有Student对象的List转为Stream流，统计集合中学生的总人数。
////8. 创建HashSet存储多个Student对象，遍历集合，找出姓名为"张三"的学生并输出。
////9. 准备一个存储Student的List集合，利用Map的特性，按学生年龄进行分组，相同年龄的学生放到一组。
////10. 创建一个工具方法，接收List集合作为参数，移除集合中年龄小于16的所有学生对