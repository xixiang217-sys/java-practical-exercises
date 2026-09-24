package java_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo06 {
    public static void main(String[] args) {
        List<Car>list=new ArrayList<>();
        list.add(new Car("aa",15.9));
        list.add(new Car("bb",25.8));
        list.add(new Car("cc",35.5));
        list.add(new Car("dd",30.2));

        Car car = list.stream().max(Comparator.comparingDouble(Car::getPrice)).orElse(null);
        System.out.println("价格最高的汽车："+car);
    }
}
//6. 定义Car类，属性：品牌、价格，创建多个Car对象存入List，找出价格最高的汽车对象。
