package day06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo05 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数组长度");
        int[]str=new int[scanner.nextInt()];
        for (int i = 0; i < str.length; i++) {
            str[i]=scanner.nextInt();
        }
        String result = "[";           // ① 开头先拼 [
        for (int i = 0; i < str.length; i++) {
            result = result + str[i];  // ② 把元素拼进去（int 自动转字符串）
            if (i != str.length - 1) { // ③ 不是最后一个元素
                result = result + ","; //    后面加逗号
            }
        }
        result = result + "]";         // ④ 结尾拼 ]


        System.out.println(result);
    }

}
////代码题5：普通String拼接数组
////需求：定义int数组，使用普通String拼接，输出格式 [元素1,元素2,元素3]