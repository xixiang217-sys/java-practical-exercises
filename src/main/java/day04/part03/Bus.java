package day04.part03;

import java.time.LocalTime;

public final class Bus extends Car{
    private LocalTime starTime;
    private LocalTime endTiem;
    private int passenger;

    public LocalTime getStarTime() {
        return starTime;
    }

    public void setStarTime(LocalTime starTime) {
        this.starTime = starTime;
    }

    public LocalTime getEndTiem() {
        return endTiem;
    }

    public void setEndTiem(LocalTime endTiem) {
        this.endTiem = endTiem;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public Bus(){
        this.starTime = LocalTime.parse("00:00");
        this.endTiem = LocalTime.parse("00:00");
        this.passenger = 0;
    }

    public Bus(LocalTime starTime, LocalTime endTiem, int passenger) {
        this.starTime = starTime;
        this.endTiem = endTiem;
        this.passenger = passenger;
    }


    @Override
    public void show(){
        System.out.println(passenger);
        System.out.println(endTiem);
        System.out.println(starTime);
        System.out.println(getColor());
        System.out.println(getTyres());
    }
    public void function(){
        if (getPassenger()>50){
            System.out.println("这是一辆大汽车，可以用作公交车");
        }
        else {
            System.out.println("这是一辆小汽车，可以用作班车");
        }
    }

}
//．创建一个类Bus，继承抽象类Car，并不允许该类再被继承，添加成员如下：
//a)属性：每天的始发时间（startTime），每天的末班时间（endTime），载客量（passenger）
//b)方法：
//i.默认构造方法：给始发时间和末班时间赋值为“00:00”，载客量为0
//ii.带参数构造方法，给属性赋值为参数值
//iii.重写父类中的抽象方法，显示该类所具备的所有属性值
//iv.function()方法：根据汽车的核载量描述该汽车的功能，当核载量大于50人时，输出“这是一辆大汽车，可以用作公交车”，否则，输出“这是一辆小汽车，可以用作班车”


