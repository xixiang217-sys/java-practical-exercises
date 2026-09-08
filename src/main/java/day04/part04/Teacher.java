package day04.part04;

public class Teacher extends Human {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher(String name, int age, String number, String sex, int salary) {
        super(name, age, number, sex);
        this.salary = salary;
    }

    public Teacher() {
    }

    @Override
    public void show(){
        System.out.println("老师信息");
    }

}
