package day04.part03;

public class Bicycle extends Car{
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Bicycle(String color, int tyres, int type) {
        super(color, tyres);
        this.type = type;
    }

    public Bicycle() {
        this.type = 24;
    }
    @Override
    public void show(){
        System.out.println(this.getType());
        System.out.println(super.getColor());
        System.out.println(super.getTyres());
    }
    public void ride(){
        if (getType()<16){
            System.out.println("这个自行车适合儿童适用");
        }
        else {
            System.out.println("这个自行车适合成年人适用");
        }

    }
}
//3．创建一个自行车类Bicycle，继承抽象类Car，添加成员如下：
//a)属性：型号（type）
//b)方法：
//i.默认构造方法：给型号赋值为24
//ii.带参数构造方法：给属性赋值为参数值
//iii.重写父类的抽象方法，显示该类所具备的所有属性值
//iv.ride():根据车的型号，描述该自行车适用的人群，当型号在16以下，输出“这个自行车适合儿童适用”，否则输出“这个自行车适合成年人适用”。