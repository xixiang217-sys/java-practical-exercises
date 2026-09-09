package day05.part03.livingimpl;

import day05.part03.LivingThing;

public class LivingThingImpl_Eagle implements LivingThing {
    private double wingspan;    // 老鹰翼展

    public LivingThingImpl_Eagle() {
    }

    public LivingThingImpl_Eagle(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void eat(String food) {
        System.out.println("老鹰吃" + food);
    }

    @Override
    public void makeVoice() {
        System.out.println("鹰啸");
    }

    public void soar() {
        System.out.println("老鹰在高空翱翔");
    }
}
//3、
//创建接口LivingThing：
//a) 常量：place，赋值为"青岛"，代表生物生活在青岛
//b) 抽象方法：
//i. void eat(String food);
//ii. void makeVoice();
//
//
//4、
//创建类Dog，实现LivingThing接口
//a) 属性：狗狗名字、狗狗品种
//b) 无参、有参构造方法
//c) 重写接口方法：
//i. eat(String food)：输出描述狗狗吃传入的食物
//ii. makeVoice()：描述狗如何叫
//d) 输出格式参考：我是青岛的一只狗，我叫旺财，品种是金毛
//
//
//5、
//创建类Duck，实现LivingThing接口
//a) 属性：鸭子颜色、鸭子年龄
//b) 无参、有参构造方法
//c) 重写接口方法：
//i. eat(String food)：输出鸭子吃传入的食物
//ii. makeVoice()：描述鸭子怎么叫
//d) 新增特有方法 void swim(int km)：输出鸭子游泳速度每小时多少公里
//e) 输出格式参考：我是青岛的一只鸭子，黄色，2岁
//
//
//
//6、
//创建类Eagle，实现LivingThing接口
//a) 属性：老鹰翼展（double）
//b) 无参、有参构造方法
//c) 重写接口方法：
//i. eat(String food)：输出老鹰吃传入的食物
//ii. makeVoice()：描述老鹰的叫声
//d) 新增特有方法 void soar()：描述老鹰高空翱翔
//e) 输出格式参考：我是青岛的一只老鹰，翼展1.8米
//
//
//
//7、
//创建类Tortoise，实现LivingThing接口
//a) 属性：乌龟外壳颜色
//b) 无参、有参构造方法
//c) 重写接口方法：
//i. eat(String food)：输出乌龟吃传入的食物
//ii. makeVoice()：描述乌龟发声特点
//d) 新增特有方法 void crawl(int speed)：输出乌龟爬行速度每小时多少公里
//e) 输出格式参考：我是青岛的一只乌龟，外壳墨绿色
//
//
//
//
//8、
//创建测试类TestLive，包含 main 主方法
//分别创建 Dog、Duck、Eagle、Tortoise 对象，通过有参构造完成属性赋值
//按照给定格式打印每个对象的身份信息，必须使用接口常量 place
//每个对象调用重写的eat()、makeVoice()方法
//Duck 调用 swim ()；Eagle 调用 soar ()；Tortoise 调用 crawl ()
//运行程序观察全部输出结果