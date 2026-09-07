package day04;

public class Manager {
    private String name;
    private  int id;
    private  double salar;
    private  double bonus;

    public Manager(String name, int id, double salar, double bonus) {
        this.name = name;
        this.id = id;
        this.salar = salar;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalar() {
        return salar;
    }

    public void setSalar(double salar) {
        this.salar = salar;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
