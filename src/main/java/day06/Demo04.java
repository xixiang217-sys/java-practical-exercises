package day06;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s=new String(scanner.next());
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

    }
}
//代码题4：遍历字符串
//需求：键盘录入任意字符串，循环遍历，打印字符串中每一个字符。
//代码题5：普通String拼接数组
//需求：定义int数组，使用普通String拼接，输出格式 [元素1, 元素2, 元素3]
//代码题6：普通方法实现字符串反转
//需求：键盘录入字符串，通过循环遍历拼接实现字符串反转输出。
//代码题7：StringBuilder创建对象
//需求：分别创建空参、有参StringBuilder对象，打印对象及长度。
//代码题8：StringBuilder追加与链式编程
//需求：创建StringBuilder对象，链式拼接字符串、数字、布尔值，打印结果。
//代码题9：StringBuilder反转字符串
//需求：键盘录入字符串，使用StringBuilder的reverse方法实现反转输出。
//代码题10：String与StringBuilder互转
//需求：完成String转StringBuilder、StringBuilder转String的代码实现并打印。
//代码题11：StringBuilder升级版数组拼接
//需求：使用StringBuilder优化数组拼接代码，实现标准格式输出。
//代码题12：Math常用方法测试
//需求：代码测试并打印：绝对值、向上取整、向下取整、四舍五入、最大值、最小值、随机数。
//代码题13：计算代码执行耗时
//需求：循环输出1~1000，使用System.currentTimeMillis计算程序运行耗时并打印。
//代码题14：字符串数字排序
//需求：给定字符串 "91 27 46 38 50"，切割、转int数组、排序、重新拼接为有序字符串输出。
//代码题15：Date时间类使用
//需求：创建当前时间Date对象、指定毫秒值Date对象，获取时间毫秒值、重置时间并打印。
//代码题16：日期格式化与解析
//需求：使用SimpleDateFormat实现：日期转自定义格式字符串、字符串解析为Date对象并打印。