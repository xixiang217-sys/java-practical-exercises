package day04.part03;

public class Autocycle extends Bicycle{
private int gas;

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public Autocycle(String color, int tyres, int type, int gas) {
        super(color, tyres, type);
        this.gas = gas;
    }

    public Autocycle() {
        this.gas =0;
    }
    @Override
    public void show(){
        super.show();
        System.out.println(this.gas);
    }

}
//4．创建一个电动自行车的类Autocycle，继承自行车类Bicycle，添加成员如下：
//a)属性：百公里耗油（gas）
//b)方法：
//i.默认构造方法：给gas赋值为0
//ii.带参数的构造方法：给属性赋值为参数值
//iii.重写父类的show（）方法，保留原有父类中该方法的功能，再添加一条显示本类独有属性的输出语句
