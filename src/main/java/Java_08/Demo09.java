package Java_08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo09 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(Map.of("张三", 20, "李四", 22, "王五", 25));
        System.out.println(hashMap.get("李四"));
        hashMap.put("张三", 21);
        System.out.println(hashMap);

    }
}
//第 9 题
//创建HashMap<String,Integer>，存入以下数据：
//"张三"=20，"李四"=22，"王五"=25zhang
//2. 修改张三的年龄为 21
//3. 打印整个 map 集合