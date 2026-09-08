package day04.part03;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        Bus bus01=new Bus();
        Bus bus02=new Bus(LocalTime.of(12,00),LocalTime.of(20,00),90);
        bus01.show();
        bus02.show();
        bus01.function();
        bus02.function();
        Bicycle bicycle01=new Bicycle();
        Bicycle bicycle02=new Bicycle("彩色",20,90);
        bicycle01.show();
        bicycle02.show();
        bicycle01.ride();
        bicycle02.ride();
    }
}
//5．创建一个测试类Test，添加main（）方法
//a)创建两个Bus对象，分别调用默认构造方法和带参数的构造方法进行实例化，显示出这两辆汽车的属性及功能
//b)创建两个电动自行车对象，分别调用默认构造方法和带参构造方法，显示出这两辆车的属性，并调用骑车的方法