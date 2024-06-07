package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //Stream API can do operation on collection or group of object means Array

        //1- blankStream
        Stream<Object> emptyStream = Stream.empty();

        //2- array, object ,collection
        String names[] = {"Durgesh", "Uttam", "Ankit", "Divya"};

        Stream<String> Stream1 = Stream.of(names);
        Stream1.forEach(e -> {
            System.out.println(e);
        });

        //3
        Stream<Object> build = Stream.builder().build();

        //4
     //List, Set, we mostly we used
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);
        Stream<Integer> stream = list2.stream();
        stream.forEach(e->{
            System.out.println(e);
        });


    }

}
