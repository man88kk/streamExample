package work;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        //Create a list and filter all even no.
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);
        List<Integer> list3 = List.of(23, 567, 12, 677, 24);

        //List1
        //without Stream
        List<Integer> ListEven = new ArrayList<>();
        for(Integer i: list1) {
            if(i%2==0) {
                ListEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(ListEven);

        //By using Stream api
        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i -> i> 10).collect(Collectors.toList());
        System.out.println(newList1);

    }
}
