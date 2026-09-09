package day05.part01;

public class Teacher extends Human {
    private int number;
    private double salary;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, boolean sex, int number, double salary) {
        super(name, age, sex);
        this.number = number;
        this.salary = salary;
    }

    public Teacher() {
    }

    @Override
    public void study(){
        System.out.println("老师在学习");
    }

}

//////学生具备姓名、年龄、工号属性，及学习行为，教师具备姓名、年龄、工号、工资属性，及学习行为，注意：学生和教师的学习行为不同，请利用抽象的思维，为学生及教师建模