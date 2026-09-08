package day04.part01;

public class Fish extends Animal {

    private String eatfood;

    public String getEatfood() {
        return eatfood;
    }

    public void setEatfood(String eatfood) {
        this.eatfood = eatfood;
    }

    public Fish() {
        super.setColor("红色");
        super.setName("金鱼");
        super.setSound("false");
    }

    public Fish(String sound, String name, String color) {
        super(sound, name, color);
    }
    @Override
    public void eatFood(){
        System.out.println(this.getEatfood());
    }


}
//3．创建一个鱼类Fish，继承Animal类：
//方法：
//i.默认构造方法，给属性分别赋值为“金鱼”、false、“红色”；
//ii.带3个参数的构造方法，先调用父类的带参数的构造方法，将本构造方法中参数接受的值传递给父类的构造方法
//iii.重写eatFood()，输出鱼类应该吃的食物
