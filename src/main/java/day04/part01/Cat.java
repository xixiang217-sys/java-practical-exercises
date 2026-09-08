package day04.part01;

public class Cat extends Animal {

    private String eatfood;

    public String getEatfood() {
        return eatfood;
    }

    public void setEatfood(String eatfood) {
        this.eatfood = eatfood;
    }

    public Cat() {
        super.setColor("白色");
        super.setName("波斯猫");
        super.setSound("true");
    }

    public Cat(String sound, String name, String color) {
        super(sound, name, color);
    }
    @Override
    public void eatFood(){
        System.out.println(this.eatfood);
    }

}
//2．创建一个猫类Cat，继承Animal类：
//方法：
//i.默认构造方法，给属性分别赋值为“波斯猫”、true、“白色”；
//ii.带3个参数的构造方法，先调用父类的带参数的构造方法，将本构造方法中参数接受的值传递给父类的构造方法，从而实现给属性赋值
//iii.重写eatFood()，输出猫类应该吃的食物