package Java_08;

public class Student {
    private Integer id;
    private String name;


    public Student() {
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
////////第 15 题
////////自定义 Student 类，属性 id,name；使用 HashMap，key 为学生 id (Integer)，value 为 Student 对象。
////////存入：
////////1,new Student (1,"张三")
////////2,new Student (2,"李四")
////////遍历 map，打印全部学生信息
////////---