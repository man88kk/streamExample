package work;


public class String_example {
    public static void main(String[] args) {

        //Some  Coding  Question String by Smart Programming
        // Uses of  .length() , .isEmpty , .trim(); lecture 7
//        String s = "abc";
//        System.out.println(s.length()); // return int value
//        System.out.println(s.isEmpty());// return boolean
//        System.out.println(s.trim());  // return String after trimming of right and left space
//
        // uses of .equal()  , .equalIgnoreCase() ,.compareTo() ,  ,Lecture 8
//        String s1 = "Manish";
//        String s2 = "Manish";
//        boolean equals = s1.equals(s2);// return boolean value
//        System.out.println(equals);
//        String s1 = "Manish";
//        String s2 = "manish";
//        boolean equals = s1.equalsIgnoreCase(s2);// return boolean value , It ignores case-sensitive
//        System.out.println(equals);

 //       String s1 = "a";
 //       String s2 = "A";
//        int i = s1.compareTo(s2);// return int value ,after subtract of int value of first letter of
         // s1 and s2 if it will be equal, then it will go for next letter
//        System.out.println(i);

//         String s1 = "a";
//         String s2 = "A";
//        int i = s1.compareToIgnoreCase(s2); // it ignores case
//        System.out.println(i);

        // uses of .concat() , String.join() , .subSequence() , .subString() method
//        String s1 = "Manish";
//        String s2 = "Kumar";
//        String s3 = "Sah";
//        System.out.println(10+s1);
//        System.out.println(s2 +10);
//        System.out.println(s1+s2);
//        System.out.println(s1+10+20);
//        System.out.println(s2 + 20/10);
//        System.out.println(s1+10+s2);
//
//        System.out.println(s1.concat(s2));
//        System.out.println(String.join(";" ,s1 , s2,s3));

//        String s = "This is demo";
//        System.out.println(s.subSequence(3 ,9));
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(3,11));

        // uses of .replace() ,replaceFirst(),  .replaceAll() ; Lecture 10
//         String s = "This is demo";
//        System.out.println(s.replace("is", "was"));//Thwas was demo
//        System.out.println(s.replaceFirst("is", "was"));//Thwas is demo
//        System.out.println(s.replaceAll("is(.)", "was")); //Thwaswasdemo  we can apply regex also

        // lecture - 10;
//        String s = "Manish";
//        System.out.println(s.charAt(2));//n
//        System.out.println(s.indexOf("i"));// 3
//        System.out.println(s.lastIndexOf("h"));//5
//        System.out.println(s.contains("ni"));//true
//        System.out.println(s.startsWith("M"));//true
//        System.out.println(s.endsWith("h"));// true
//
//        String s = "Manish";
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//         int i =10  ; int j =20;
//        System.out.println(i+j);
//        String s1 = String.valueOf(i);// it will String value of i
//        String s2 = String.valueOf(j);
//        System.out.println(s1+s2);
//
//        char[] ch = s.toCharArray(); // it will give Array of Character
//        System.out.println(ch);

        // what is String Buffer and its important method ; lecture -13
        // every method are Synchronized , And object of String Buffer are mutable
        // note down on copy after watching video
//        StringBuffer sb = new StringBuffer();
//        System.out.println(sb.capacity()); // default capacity 16
//        sb.append("Manish");
//        System.out.println(sb.capacity());
//        sb.append("Manish Kumar");
//        System.out.println(sb.capacity());// (old capacity * 2)+2

//        StringBuffer sb1 = new StringBuffer("Manish");
//        StringBuffer sb2 = new StringBuffer("Manish");
//        System.out.println(sb1.equals(sb2)); // false because it will compare object address only in case of bufferString
//        System.out.println(sb1.length());
//        System.out.println(sb1.append("Hi"));// it will add
//        System.out.println(sb1.reverse());
//        System.out.println(sb1.delete(2,5));
//        System.out.println(sb1.insert(3,"zzzz"));
//        System.out.println(sb1.replace(2,5,"f"));
//        System.out.println(sb1.reverse());

          // lecture -14
        // what is String Builder and its important method , same method also present in String Builder
        // and every method are non Synchronized , And object of String Buffer are mutable

        // lecture- 15
        // note down on copy diff b/w String ,StringBuffer and StringBuilder


        // Teach by PSA
        //wap to count the specific letter in a String which is repeated
//        String s = "madam";
//        int count = 0;
//        for (int i = 0 ; i < s.length(); i++){
//           if(s.charAt(i)=='m'){
//               count++;

//           }
//        }
//        System.out.println(count);

        // wap to print a reverse  of a String
        //   String s = "mike";
        // first Approach
//        for (int i = s.length()-1 ; i >=0 ; i--){
//            System.out.print(s.charAt(i));
//        }
        // 2nd approach
//        char[] ch = s.toCharArray();// toCharArray in will convert the String into Array's of Character
//        for (int i=ch.length - 1 ; i>=0;i--){
//            System.out.println(ch[i]);
//        }
        //3rd Approach
        //    StringBuffer sb = new StringBuffer(s);
        //   System.out.println(sb.reverse());// reverse() method is provided by StringBuffer
        //
        //   4th Approach
        //  StringBuilder sb1 = new StringBuilder(s);
        //   System.out.println(sb1.reverse());// reverse() method is provided by StringBuilder


        // wap to count the no. of word in given sentence
//        String s = "My name is Mike Thyson";
//        String[] data = s.split(" ");
//        System.out.println(data.length);

        // wap to count the no. of  word in given sentence
//        String s = "Mike My name Mike is Mike Thyson Mike";
//        String[] data = s.split(" ");
//        int count = 0;
//        for (int i = 0 ; i < data.length ; i++){
//            if ( data[i].equals("Mike"))
//            count++;
//        }
//        System.out.println(count);

        // wap to print reverse of a given sentence
//        String s = "Pankaj Sir Academy";
//        for (int i = s.length()-1 ; i >= 0 ; i--){
//            //System.out.println(i); // it will print of index no.
//            System.out.print(s.charAt(i));
        // }
        // wap to print the length of String and every word
//        String s = "pankaj sir academy test";
//        String[] data = s.trim().split(" ");
//        System.out.println(s.length());
//        for (String x : data){
//            System.out.println(x);
//        }
        // wap to check whether a curly braces are equal or not
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter opening and closing paranthesis");
//        String s = sc.next();
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0 ; i< s.length(); i++) {
//            if (s.charAt(i) == '}') {
//                count1++;
//
//            } else if (s.charAt(i) == '{') {
//                count2++;
//            }
//        }
//        if (count1==count2){
//            System.out.println("no error");
//        }
//        else
//            System.out.println("error");

        // wap to convert an string into Uppercase And lowercase
//        String s = "PankaJ SiR acdeEMY";
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        System.out.println(s.trim());

        // wap to check whether a String is starts with a and end wir
//        String s = "aabaaacz";
//        System.out.println(s.startsWith("a"));
//        System.out.println(s.endsWith("z"));

        // wap to convert char to string
//        char[] i = {'a','b','c'};
//        String s = String.valueOf(i);
//        System.out.println(s);

//     question on Star printing
//         for (int i = 0 ; i <= 5 ; i++){
//             for (int j = 0 ; j <=5 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println("\n");
//         }

//        for (int i = 0 ; i <= 5 ; i++) {
//            for (int j = 0; j <= 5; j++) {
//         if( i == 0 && j==1 || i==0 && j== 2){
//             System.out.print(" ");
//         }
//         else {
//             System.out.print("*");
//         }
//            }
//        }
//        System.out.println("\n");

        //Q -  subtract two String, String original = "My name is Manish;
        //String for_subtract = "name Manish";
        // print result "My is";
//        String original = "My name is Manish";
//        String for_subtract = "name Manish";
//        String result = original.replace("name","")
//                .replace("Manish","");
//        System.out.println(result);

        // Q - Swap to String with using third variable and without using third variable
//        String a = "Manish";
//        String b = "Kumar";
//        String temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);

//        String a = "Manish";
//        String b = "Kumar";
//        a = a+b;
//        b = a.substring(0 , a.length()-b.length());
//        a = a.substring(b.length());
//        System.out.println(a);
//        System.out.println(b);

        //Some important Coding interview Question String by Ashok it

        // wap to print a reverse  of a String
        //   String s = "mike";
        // first Approach
//        for (int i = s.length()-1 ; i >=0 ; i--){
//            System.out.print(s.charAt(i));
//        }
        // 2nd approach
//        char[] ch = s.toCharArray();// toCharArray in will convert the String into Array's of Character
//        for (int i=ch.length - 1 ; i>=0;i--){
//            System.out.println(ch[i]);
//        }
        //3rd Approach
        //    StringBuffer sb = new StringBuffer(s);
        //   System.out.println(sb.reverse());// reverse() method is provided by StringBuffer
        //
        //       StringBuilder sb1 = new StringBuilder(s);
        //       System.out.println(sb1.reverse());// reverse() method is provided by StringBuilder

        //Q remove All special character.
        // print only letter

//        String s1 = "@fgd@!$%^#JujTI";
//        String result = s1.replaceAll("[^a-zA-Z0-9]","");// replaceAll - this method is provide by String
//        // replaceAll method will replace all from  this "" except ^a-zA-Z0-9
//        System.out.println(result);

        // Remove all white space
//        String s1 = "   j  a   v a";
//        String result = s1.replaceAll("\\s","");
//        //   \\s  it represents a single space which is removed by ""
//        System.out.println(result);

        // Remove all duplicate character  from given String

        //Approach 1 : By using java 8 mechanism
//        String s1 = "programming";
//        StringBuilder sb1 = new StringBuilder();
//        s1.chars().distinct().forEach(c-> sb1.append((char) c));
//        sb1.append():
//        The append method of the StringBuilder class adds the given character (or other data types) to the end of the current string being constructed by sb1.
        //the value of c (an integer) is explicitly cast to a char.
        //c = 65 → (char) c = 'A'
        //       System.out.println(sb1);

        //Approach 2 :using ndex of method that is provided by String class
//        String s1 = "programming";
//        StringBuilder sb1 = new StringBuilder();
//        for(int i = 0; i<s1.length(); i++){
//            char ch = s1.charAt(i);
//            int index = s1.indexOf(ch , i+1);
//            // s1.indexOf - it will check the value of ch is present anywhere except on its own location
//            if(index==-1){
//                sb1.append(ch);
//            }
//        }
//        System.out.println(sb1);

        // Approach 3 : we will use toCharArray method
        //       String s1 = "programming";
//        StringBuilder sb1 = new StringBuilder();
//        char[]  arr= s1.toCharArray();
//        for (int i = 0 ; i<s1.length(); i++){
//            boolean repeated = false;
//            for (int j = i+1 ; j<s1.length(); j++){
//                if(arr[i]==arr[j]){
//                  repeated = true;
//                  break;
//                }
//            }
//            if (!repeated)
//            sb1.append(arr[i]);
//        }
//        System.out.println(sb1);

        // Approach 4 : we will use set
//               String s1 = "programming";
//               StringBuilder sb1 = new StringBuilder();
//        Set<Character> st = new LinkedHashSet<>();
//        for (int i =0; i<s1.length(); i++){
//            st.add(s1.charAt(i));
//        }
//        for (Character c : st){
//            sb1.append(c);
//        }
//        System.out.println(sb1);

        // Q - Arrange the String on Alphabetic order
        // approach without using  sort method
//        String s = "rock";
//        char arr[] = s.toCharArray();
//        char temp;
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i+1; j<arr.length ; j++ ){
//              if(arr[i] > arr[j]) {
//                  temp = arr[i];
//                  arr[i] = arr[j];
//                  arr[j] = temp;
//              }
//            }
//        }
//        System.out.println(new String(arr));

        // approach -2 with using  sort method
//        String s = "rock";
//         char[] ch = s.toCharArray();
//        Arrays.sort(ch);
//        System.out.println(new String(ch));

        // Q - In the given String "opentext" you have to repalce 1st t from 1 , 2nd t from 2 and so on..
        // Approach 1 ;
//        String s = "opentext";
//        char replacechar = 't';
//        if(s.indexOf(replacechar)==-1) {
//            System.out.println("Yes this character comes under String");
//            System.exit(1);
//        }
//        char arr[] = s.toCharArray();
//        int cnt = 1;
//        for(int i = 0 ; i<arr.length ; i++){
//            if(arr[i]== replacechar){
//                arr[i] = String.valueOf(cnt).charAt(0);
//               cnt ++;
//
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        // but this logic will not work if t comes more then 10 times
        //Approach -2nd
//        String s = "opentext";
//        char replacechar = 't';
//        int cnt = 1;
//        for(int i =0 ; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(ch == replacechar){
//               s = s.replaceFirst(String.valueOf(ch), String.valueOf(cnt));
//               cnt ++;
//            }
//        }
//        System.out.println(s);

        // check first non-repeated character of a given array
        //Approach - 1 without using collection
//        String s = "AABCDBE";
//        for(int i = 0; i<s.length();i++){
//              boolean unique = true;
//            for(int j =0 ;j<s.length();j++){
//                if(i!=j && s.charAt(i)== s.charAt(j)){
//                    unique = false;
//                }
//            }
//            if (unique){
//                System.out.println(s.charAt(i));
//                break;
//            }
//        }

        // Approach 2 - with using collection
//        String s = "AABCDBE";
//        Map<Character , Integer> map = new HashMap<>();
//
//         for(int i= 0 ; i<s.length();i++){
//             char ch = s.charAt(i);
//             if (map.containsKey(ch)){
//                 map.put(ch , map.get(ch)+1);
//             }
//             else {
//                 map.put(ch,1);
//             }
//
//         }
//        System.out.println(map);
//        for(Map.Entry<Character , Integer> entrySet : map.entrySet()){
//            if (entrySet.getValue()==1){
//                System.out.println(entrySet.getKey());
//                break;
//            }
//        }

        // Count the each charactors comes how many time in the given string
//        String s = "mumbai";
//        Map<Character , Integer> map = new HashMap<>();
//        char[] chars = s.toCharArray();
//            for (char ch : chars) {
//                if (map.containsKey(ch)) {
//                    int value = map.get(ch);
//                    map.put(ch, value + 1);
//                }
//                else {
//                    map.put(ch, 1);
//                }
//            }
        //       System.out.println(map);

        // print each word of the given sentence in reverse order
//          String s = "hello world";
//          String[] s1 = s.split(" ");
//          String output = "";
//          for(String word : s1){
//              String reverseWord = " ";
//              for (int i= word.length()-1 ;i >=0 ; i--){
//                 reverseWord = reverseWord + word.charAt(i);
//              }
//              output = output + reverseWord;
//          }
//        System.out.println(output);

        // count and print longest possible word that contain a String
//        String s = "java";
//        Map <Character ,Integer> map = new LinkedHashMap<>();
//        String LongestSubString = null;
//        int LongestSubStringLength = 0;
//        char[] arr = s.toCharArray();
//        for (int i=0 ;i< arr.length;i++ ){
//            char ch = arr[i];
//            if (!map.containsKey(ch)){
//                map.put(ch,i);
//            }
//            else {
//                map.clear();
//            }
//            if (map.size()>LongestSubStringLength){
//                LongestSubStringLength= map.size();
//                LongestSubString= map.keySet().toString();
//            }
//        }
//        System.out.println(LongestSubString);
//        System.out.println(LongestSubStringLength);


    }
   }
