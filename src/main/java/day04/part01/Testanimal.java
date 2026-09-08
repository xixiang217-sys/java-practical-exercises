package day04.part01;

public class Testanimal {
    public static void main(String[] args) {
        Cat cat = new Cat("叫", "小黑", "黑");
        Fish fish = new Fish("不叫", "小6", "白");
        Bird bird = new Bird("叫", "小9", "彩色");
        cat.setEatfood("猫条");
        cat.eatFood();
        fish.setEatfood("小鱼");
        fish.eatFood();
        bird.setEatfood("虫子");
        bird.eatFood();
    }
}
//5．创建一个测试类TestAnimal，该类中只包含main（）方法：在该方法中实现如下功能：
//1）创建一个猫类对象，通过键盘输入，给所有属性赋值并输出，显示出该动物所吃的食物
//2）创建一个鱼类对象，通过键盘输入，给所有属性赋值并输出，显示出该动物所吃的食物
//3）创建一个鸟类对象，通过键盘输入，给所有属性赋值并输出，显示出该动物所吃的食物