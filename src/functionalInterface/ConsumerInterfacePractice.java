package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfacePractice {

    static void showDetail(List<Integer> l1){
        l1.forEach(i-> System.out.println(i));
    }

    public static void main(String[] args) {

        List<Integer> myList1 = new ArrayList<>();
        myList1.add(12);
        myList1.add(34);
        Consumer<List<Integer>> myConsumer = ConsumerInterfacePractice::showDetail;

        myConsumer.accept(myList1);

    }
}
