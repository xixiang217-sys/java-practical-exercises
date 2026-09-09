package day05.part02.animalimpl;

import day05.part02.Animal;

public class AnimalImpl_Fish implements Animal {
    private String count;  //种类
    private String color;


    public String getColor() {
        return color;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AnimalImpl_Fish(String count, String color) {
        this.count = count;
        this.color = color;
    }

    public AnimalImpl_Fish() {
    }

    @Override
    public void eat(String food) {
        System.out.println("鱼吃"+food);
    }


    @Override
    public void sound() {
        System.out.println("桀桀叫");
    }

    public void swim(int speed){
        System.out.println("每小时"+speed+"公里");

    }

}
////////1、创建接口Animal，包含：
////////a)常量：city，赋值为“大连”（代表动物生存在大连）
////////b)方法：
////////i.eat(String food);
////////ii.sound();
////////2、创建类Cat，实现Animal接口
////////a)属性：猫的名字、猫的颜色
////////b)方法：
////////i.eat(String food):描述猫吃什么食物，食物通过参数接受
////////ii.sound():描述猫是如何叫的
////////3、创建类Fish，实现Animal接口
////////a)属性：鱼的种类、鱼的颜色
////////b)方法：
////////i.eat(String food):描述鱼吃什么食物，食物通过参数接受
////////ii.sound():描述鱼是如何叫的
////////iii.swim(int speed):描述鱼游的速度，根据参数的值，输出鱼游的速度为每小时多少公里
////////4、创建类Bird，实现Animal接口
////////a)属性：鸟的体长
////////b)方法：
////////i.eat(String food):描述鸟吃什么食物，食物通过参数接受
////////ii.sound():描述鸟是如何叫的
////////iii.fly():描述鸟是如何飞的
////////5、创建类TestAnimal，包含主方法
////////a)创建猫、鱼、鸟类各一个对象，分别给它们的属性赋值，输出的效果参照“我是大连的一只猫，我叫安哥拉猫，白色的”
////////使用每个对象分别调用各自拥有的方法
