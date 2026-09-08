package day04.part01;

public class Animal {
    private String name;
    private String sound;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String sound, String name, String color) {
        this.sound = sound;
        this.name = name;
        this.color = color;
    }

    public Animal() {
        this.name="怪物";
        this.color="黑色";
        this.sound="true";
    }
    public void eatFood(){
        System.out.println("我是一个动物，我什么都吃");
    }
    public final void ShowAnimal(){
        System.out.println("这是一只"+this.color+"颜色的"+this.name+",他会叫");
    }

}
//．创建一个动物类Animal，包括的成员如下：
//a)属性：动物的名字（name），动物是否会叫（sound），颜色（color）
//b)方法：
//i.默认构造方法，给属性分别赋值为“怪物”、true、“黑色”；
//ii.带三个参数的构造方法，给属性赋值为参数的值
//iii.吃食的方法：eatFood（）：输出“我是一个动物，我什么都吃”
//        显示所有属性的方法：showAnimal（），声明为final类型，输出的效果为“这是一只**色的**，它会叫”或者“这是一只**色的**，它不会叫”
