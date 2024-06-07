package work;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {
        //     To find each charactors comes how many time
//          String input = "aaabbcccda";
//        Map<String, Long> collect = Arrays.stream(input.split(""))
//                .collect(Collectors.groupingBy((Function.identity()), Collectors.counting()));
//        System.out.println(collect);

        //wap to check how many time Mike has written
//        List<String> name = Arrays.asList("Mike","Stallin","Mithun","Mike","Smith","Michel");
//        List<String> name1 = name.stream().filter(e-> e.equals("Mike")).collect(Collectors.toList());
//        System.out.println(name1.size();

        //Wap to print squre of every element
//        List<Integer> list= List.of(5,8,9,2,11,21,1);
//        List<Integer> list1= list.stream().map(e-> e*e).collect(Collectors.toList());
//        System.out.println(list1);

        //Wap to remove duplicate element
//       List<Integer> data = Arrays.asList(10,2,10,34,21,23,5,2);
//        List<Integer> data1 =data.stream().distinct().collect(Collectors.toList());
//        System.out.println(data1);


        //  To find which charactor comes only one time
//        String input = "ilovejavatechie";
//        List<String> collect = Arrays.stream(input.split("")).collect(Collectors
//                        .groupingBy((Function.identity()), Collectors.counting()))
//                .entrySet().stream().filter(x -> x.getValue() == 1)
//                .map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(collect);

        // wap to find which is no. are bigger then 20
//        List<Integer> data = Arrays.asList(10,20,30,5,50,100);
//        List<Integer> data1 = data.stream().filter(e->e>20).collect(Collectors.toList());
//        System.out.println(data1);

        //Arrange in acen and desc
//        List<Integer> list= List.of(5,8,9,2,11,21,1) ;
//        List collect = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);

//        List<Integer> list= List.of(5,8,9,2,11,21,1) ;
//        List collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(collect);

//       To find the 2nd highest no.
//       int[] number= {5,8,9,2,11,21,1} ;
//       Integer SecHigNo=Arrays.stream(number)
//               .boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(SecHigNo);

        //To find the 2nd lowest no.

//       int[] number= {5,8,9,2,11,21,1} ;
//        Integer SecHigNo=Arrays.stream(number)
//                .boxed().sorted().skip(1).findFirst().get();
//        System.out.println(SecHigNo);

        //to find the logestWord
//        String[] str = {"Java", "techie","springboot", "Microservices"};
//        String s = Arrays.stream(str).reduce((word1, word2) -> word1.length() < word2.length() ?
//                word1 : word2).get();
//        System.out.println(s);

        //to find which no. is started with i
//        int[] number= {5,8,9,2,11,21,1} ;
//        List<String> collect = Arrays.stream(number).boxed().map(s -> s + " ").
//                filter(s -> s.startsWith("1")).collect(Collectors.toList());
//        System.out.println(collect);

        //to find which no. is even
//        List<Integer> list= List.of(5,8,9,2,11,21,1) ;
//        List collect = list.stream().filter(e->e%2==0).collect(Collectors.toList());
//        System.out.println(collect);


        //find min no.
        // List<Integer> list= List.of(5,8,9,2,11,21,1) ;
//        Integer i = list.stream().min((x,y)->x.compareTo(y)).get();
//        System.out.println(i);

        //find max no.
//        List<Integer> list= List.of(5,8,9,2,11,21,1) ;
//        Integer i = list.stream().max((x , y)-> x.compareTo(y)).get();
//        System.out.println(i);

        // example of flat map
//        List<List<Integer>> nestedlist = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));
//        System.out.println(nestedlist);
//        List<Integer> flatenedlist = nestedlist.stream().flatMap(List::stream)
//                .collect(Collectors.toList());
//        //As a result, flatMap(List::stream) will transform the stream of lists in -
//        // a single stream containing all the elements of those inner lists, effectively flattening the nested structure.
//        System.out.println(flatenedlist);

        // some imp Q by varsha mam

        // Find the sum of all element
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5) ;
//        int sum = nums.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

        // find average
//        List<Double> nums = Arrays.asList(1.2, 4.2, 5.4, 4.1,5.5) ;
//        Double average = nums.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
//        System.out.println(average);

        //find max no.
//         List<Integer> list= List.of(5,8,9,2,11,21,1) ;
//        Integer i = list.stream().max(Comparator.naturalOrder()).get();
//        System.out.println(i);

        //count the no. of string which start with specific charactor
//        List<String> fruits = Arrays.asList("cherry","banana","coconut","berry","cantaloupe");
//        long fr = fruits.stream().filter(e -> e.startsWith("c")).count();
//        System.out.println(fr);

        //convert in uppercase and print
        //List<String> fruits = Arrays.asList("cherry","banana","coconut","berry","cantaloupe");
      //  fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        //in above Q concatenate all the String by using stream

      //  String collect = fruits.stream().collect(Collectors.joining(":"));
      //  System.out.println(collect);

        // wap to check all element in the satisfy the given condition
//         List<Integer> list =Arrays.asList(2,4,6,8,10);
//        boolean isEven = list.stream().allMatch(e -> e % 2 == 0);
//        System.out.println(isEven);

        // find and print the frequency of each word in a given sentence
//        String sentence = "Java is programming language. Java is versatile.";
//        Map<String , Long> wordfreqmap = Arrays.stream(sentence.split("\\s+"))
//                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
//        System.out.println(wordfreqmap);

        // given a no. of list, groub them by using first letter and then count the no.
//        String[] names = {"Alice","Bob","Charlie","Amy","Anna"};
//        Map<Character, Long> namemap = Arrays.stream(names)
//                .collect(Collectors.groupingBy(s->s.charAt(0), Collectors.counting()));
//        System.out.println(namemap);

        // find and print duplicate no. in an array if it contain duplicate?
//        int[] arr = {2,4,2,3,1,5,78,3,1,5};
//        Arrays.stream(arr).boxed().collect(Collectors
//                        .groupingBy(e-> e,Collectors.counting())).entrySet().stream()
//                .filter(entry-> entry.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
//
        //How are duplicate removed from a given array in java
//        int[] arr = {2,4,2,3,1,5,78,3,1,5};
//        int[] array = Arrays.stream(arr).distinct().toArray();
//        System.out.println(Arrays.toString(array));

        // given a list of word, filter and print the palimdrome
//        List<String> strings = List.of("level", "hello","radar","World","deed");
//        List<String> palimdrome = strings.stream().filter(str-> str.equals(new StringBuilder(str)
//                .reverse().toString())).collect(Collectors.toList());
//        System.out.println(palimdrome);

        // How do you merge two sorted array into a single sorted array?
//        int[] array1 = {1,3,5,7};
//        int[] array2 = {2,4,6,8};
//       int[] sortedArray = IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).sorted().toArray();
//        System.out.println(Arrays.toString(sortedArray));

        // Given a list of String, Concatenate them and remove duplicate
//        List<String> list1 = List.of("apple","banana","Orange");
//        List<String> list2 = List.of("banana","kiwi","grape");
//        List<String> uniquelist = Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
//        System.out.println(uniquelist);

        // sort them a/c to increasing order of their lenth
        List<String> fruits = List.of("apple","banana","Orange","kiwi");
        fruits.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        // you tube channel name- Sreenu tech
        // use of Count method

        // All example of intermidiate operation
//        int[] a = {10, 20 ,30};
//         long count = Arrays.stream(a).count();
//        System.out.println(count);

        // print the element as it is
//        int[] a = {10, 20 ,30};
//         Arrays.stream(a).forEach(e->{
//            System.out.println(e);
//        });

        //    sort the element
//       int[] a = {10, 20 ,30};
//       Arrays.stream(a).sorted().forEach(e->{
//            System.out.println(e);
//        });

        //remove the duplicat element
        //  int[] a = {10, 20 ,10, 20,30};
//         Arrays.stream(a).distinct().forEach(e->{
//            System.out.println(e);
//        });

        // add the element
//        int[] a = {10, 20 ,30};
//        int sum = Arrays.stream(a).sum();
//        System.out.println(sum);

        // find the average
//        int[] a = {10, 20 ,30};
//        OptionalDouble average = Arrays.stream(a).average();
//        System.out.println(average.getAsDouble());

        // find even no.
//        int[] a = {10,11, 12, 20 ,30};
//        Arrays.stream(a).filter(e->e%2==0).forEach(e->{
//            System.out.println(e);
//        });

        //fint min and max element
//        int[] a = {10,11, 12, 20 ,30};
//        int min = Arrays.stream(a).min().getAsInt();
//        System.out.println(min);
//
//        int max = Arrays.stream(a).max().getAsInt();
//        System.out.println(max);

//        // romove null value from list
//         List<String> list = new ArrayList<>();
//         list.add("c");
//         list.add("a");
//         list.add("b");
//         list.add("c");
//         list.add(null);
//         list.stream().filter(e-> e!=null).forEach(
//                 (e)->{
//                     System.out.println(e);
//                 }
//         );

        // romove null value from list
//        List<String> list = new ArrayList<>();
//        list.add("c");
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add(null);
//        list.stream().distinct().forEach(
//                (e)->{
//                    System.out.println(e);
//                }
//        );

        // remove dublicate and null value

//        List<String> list = new ArrayList<>();
//        list.add("c");
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add(null);
//        list.stream().distinct().filter(e-> e!=null).forEach(
//                (e)->{
//                    System.out.println(e);
//                }
//        );

        // remove dublicate, null value and sort the element
//        List<String> list = new ArrayList<>();
//       list.add("c");
//       list.add("a");
//       list.add("b");
//        list.add("c");
//        list.add(null);list.stream().distinct().filter(e-> e!=null).sorted().forEach(
//                (e)->{
//                    System.out.println(e);
//                }
//        );

        // in above Q i also want to Convert in upper case

//        List<String> list = new ArrayList<>();
//        list.add("c");
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add(null);
//        list.stream().distinct().filter(e-> e!=null).map(f->f.toUpperCase()).sorted().forEach(
//                (e)->{
//                    System.out.println(e);
//                }
//       );
        // print only two element
        // limit() method will take size as i/p
        //limit(2) -> return stream which contain two element

        // in same way can use skip() - i will return stream after skip
//        List<String> list = new ArrayList<>();
//        list.add("c");
//        list.add("a");
//        list.add("b");
//        list.add("d");
//        list.add("e");
//        list.stream().skip(2).limit(2).forEach(
//                (e)->{
//                    System.out.println(e);
//                }
//        );

        //Ex of terminal operation
        // reduce() - will reduce data into single element
//        List<Integer> list = new ArrayList<Integer>();
//       list.add(1);
//       list.add(2);
//       list.add(3);
//        list.add(4);
//        Optional<Integer> reduce= list.stream().reduce((a,b)->a+b);
//        System.out.println(reduce.get());

        // Count() - will give no. of element exist in iven string
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        long count = list.stream().count();
//        System.out.println(count);
//
        //   forEach()  - will take consumer as i/p,
        //   process one by one element and finally displayed to end-User
//         List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//         list.stream().forEach(
//                 (x)->{
//                     System.out.println(x);
//                 }
//         );
        // use of toArrays()
        // toArrays() is used to convert stream to array
        //how to convert stream to arrays
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        Object[] obj = list.stream().toArray();
//        for(Object O: obj)
//        {
//            System.out.println(O);
//        }
        // find max element
        //   List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        Object[] obj = list.stream().toArray();
//        for(Object O: obj)
//        {
//            System.out.println(O);
//        }

        // find max and min element from list
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        Optional<Integer> max = list.stream().max((v1, v2) -> v1.compareTo(v2));
//        System.out.println(max.get());
//        Optional<Integer> min = list.stream().min((v1, v2) -> v1.compareTo(v2));
//        System.out.println(min.get());

        // collect - it is a terminal operator which is used to convert
        // stream to list/set/map back
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(3);
//         list.add(4);
//        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);
//        Set<Integer> collect1 = list.stream().distinct().collect(Collectors.toSet());
//        System.out.println(collect1);

//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(3);
//         list.add(4);
        // uses of findFirst() it will return first element
//       Optional<Integer> findFirst = list.stream().findFirst();
//        System.out.println(findFirst.get());

        //uses of findAny() it will return first element
//        Optional<Integer> findFirst = list.stream().findAny();
//        System.out.println(findFirst.get());

        //Uses anyMatch():- It will take predicate as i/p
        //return truwe if any element satisfy iven condition else return false

//        List<String> list = new ArrayList<String>();
//        list.add("We");
//        list.add("are");
//        list.add("going");
//        list.add("to");
//        list.add("workshop");
//        list.add("on stream api");
//        list.add("from");
//        list.add("sreenu tech");
//        boolean fi = list.stream().anyMatch(e-> e.startsWith("workshop"));
//        System.out.println(fi);

        // ex of allMatch()
        // will return true if all element should satisfy given condition
        // suppose any one element doesn't satisfy given condition thhen allMatch() return false
//       boolean fi = list.stream().allMatch(e-> e.startsWith("workshop"));
//        System.out.println(fi);

        // nonMatch() will take predicate as i/p
        // it return false

        //  nonMatch() - will return true if any element satisfy given condition
        // suppose any one element satisfy given condition then nonMatch() return false
//        boolean fi = list.stream().noneMatch(e-> e.startsWith("Manish"));
//       System.out.println(fi);


        // uses of findAny() - It will return any element in given stream
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(3);
//        Optional<Integer> findfirst = list.stream().findAny();
//        System.out.println(findfirst.get());

        //Map - suppose we want to store data in the form of key and
        // value pair ten we will go for map
        //Key should be one , value should be dublicate
        //KeySet() - is used to get only key
        // values() - is used to only values
        //entrySet() - is used to get both key and value

        //Q - print only key using stream Api
//        Map<Integer, String> mp = new HashMap<Integer, String>();
//        mp.put(2 ,"C");
//        mp.put(3 ,"B");
//        mp.put(1 ,"D");
//        mp.put(4 ,"B");
//        mp.keySet().stream().forEach(
//                (k)->{
//                    System.out.println(k);
//                }
//        );
        // to get only value
//        mp.values().stream().forEach(
//                (k)->{
//                    System.out.println(k);
//                }
//        );
        // to get both key and value
//        mp.entrySet().stream().forEach(
//                (k)->{
//                    System.out.println(k);
//                }
//        );
        // sort the data based on key in desc order
//
        // sort the data based on key in asc order
//        mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(
//                (k)->{
//                    System.out.println(k);
//                }
//        );
        // construct list based on key
//        List<Integer> kys = mp.keySet().stream().collect(Collectors.toList());
//        System.out.println(kys);

        // construct list based on value
//        List<String> kys = mp.values().stream().collect(Collectors.toList());
//        System.out.println(kys);

        // Mini project
    }
}