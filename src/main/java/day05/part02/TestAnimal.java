package day05.part02;

import day05.part02.animalimpl.AnimalImpl_Bird;
import day05.part02.animalimpl.AnimalImpl_Cat;
import day05.part02.animalimpl.AnimalImpl_Fish;

public class TestAnimal {


    public static void main(String[] args) {
        AnimalImpl_Cat cat=new AnimalImpl_Cat("橘猫","橘黄色的");
        AnimalImpl_Fish fish=new AnimalImpl_Fish("锦鲤","红白相间的");
        AnimalImpl_Bird bird=new AnimalImpl_Bird(45);

        System.out.println("我是"+Animal.city+"的一只猫，我叫"+cat.getName()+"，"+cat.getColor());
        System.out.println("我是"+Animal.city+"的一条鱼，我是"+fish.getCount()+"，"+fish.getColor());
        System.out.println("我是"+Animal.city+"的一只鸟，体长"+bird.getBody()+"厘米");

        cat.eat("小鱼干");
        cat.sound();
        fish.eat("水草");
        fish.sound();
        fish.swim(100000);
        bird.eat("虫子");
        bird.sound();
        bird.fly();
    }

}

//////1、创建接口Animal，包含：
//////a)常量：city，赋值为“大连”（代表动物生存在大连）
//////b)方法：
//////i.eat(String food);
//////ii.sound();
//////2、创建类Cat，实现Animal接口
//////a)属性：猫的名字、猫的颜色
//////b)方法：
//////i.eat(String food):描述猫吃什么食物，食物通过参数接受
//////ii.sound():描述猫是如何叫的
//////3、创建类Fish，实现Animal接口
//////a)属性：鱼的种类、鱼的颜色
//////b)方法：
//////i.eat(String food):描述鱼吃什么食物，食物通过参数接受
//////ii.sound():描述鱼是如何叫的
//////iii.swim(int speed):描述鱼游的速度，根据参数的值，输出鱼游的速度为每小时多少公里
//////4、创建类Bird，实现Animal接口
//////a)属性：鸟的体长
//////b)方法：
//////i.eat(String food):描述鸟吃什么食物，食物通过参数接受
//////ii.sound():描述鸟是如何叫的
//////iii.fly():描述鸟是如何飞的
//////5、创建类TestAnimal，包含主方法
//////a)创建猫、鱼、鸟类各一个对象，分别给它们的属性赋值，输出的效果参照“我是大连的一只猫，我叫安哥拉猫，白色的”
//////使用每个对象分别调用各自拥有的方法
