package day04.part04;

public abstract class Human {
    private String name;
    private  int age;
    private  String number;
    private String Sex;


    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
    public Human(String name, int age, String number, String sex) {
        this.name = name;
        this.age = age;
        this.number = number;
        Sex = sex;
    }


    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public abstract void show();

}
//学生具备姓名、年龄、工号属性，及学习行为，教师具备姓名、年龄、工号、工资属性，及学习行为，
// 注意：学生和教师的学习行为不同，请利用抽象的思维，为学生及教师建模