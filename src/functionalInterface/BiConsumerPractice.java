package functionalInterface;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerPractice {

//    static void ShowDetails(String name, Integer age){
//        System.out.println(name + " " + age);
//    }

    static void showDetail(Map<Integer, String> map, String mapName){
      map.forEach((Key,value)->System.out.println(Key+ " " + value));
    }

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer1 = (s,v)->System.out.println(s + " " + v);
        biConsumer1.accept("Prakash",1);

        Map<Integer, String> myMap = new HashMap<Integer,String>();
        myMap.put(1,"Prakash");
        myMap.put(2, "Prakash2");

        BiConsumer<Map<Integer,String>,String> biConsumer2= BiConsumerPractice::showDetail;
        biConsumer2.accept(myMap,"Students");
    }
}
