package day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo04 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("哈尔滨");
        collection.add("北京");
        collection.add("上海");
        collection.add("广州");
        collection.add("深圳");
        Iterator<String> iterator=collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//哈尔滨、北京、上海、广州、深圳
    }
}
