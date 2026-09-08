package day04.part01;

public class Bird extends Animal {
    private String eatfood;

    public String getEatfood() {
        return eatfood;
    }

    public void setEatfood(String eatfood) {
        this.eatfood = eatfood;
    }

    public Bird(String sound, String name, String color) {
        super(sound, name, color);
    }

    public Bird() {
        super.setColor("褐色");
        super.setName("麻雀");
        super.setSound("true");
    }
    @Override
    public void eatFood(){
        System.out.println(this.getEatfood());
    }

}
//4．创建一个鸟类Bird，继承Animal类：
//方法：
//i.默认构造方法，给属性分别赋值为“麻雀”、true、“褐色”；
//ii.带3个参数的构造方法，先调用父类的带参数的构造方法，将本构造方法中参数接受的值传递给父类的构造方法，从而实现给属性赋值
//iii.重写eatFood()，输出鸟类应该吃的食物