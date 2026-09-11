package day06;

public class Demo08 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(10).append("qwer").append(true);
        System.out.println(stringBuilder);


    }



}
//////代码题8：StringBuilder追加与链式编程
//////需求：创建StringBuilder对象，链式拼接字符串、数字、布尔值，打印结果。