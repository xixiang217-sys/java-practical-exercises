package day04.part03;

public abstract class Car {
    private String color;
    private int tyres;

    public Car(String color, int tyres) {
        this.color = color;
        this.tyres = tyres;
    }

    public Car() {
        this.setColor("黑色");
        this.setTyres(0);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }
    public abstract void show();

}
//1．创建一个定义汽车的抽象类Car，包括成员如下：
//a)属性：颜色（color），轮胎个数（tyres）
//b)方法：
//i.默认构造方法：颜色为黑色，轮胎有0个
//ii.带参数的构造方法，给属性赋值为参数值
//iii.显示属性show（），返回值为空，抽象方法