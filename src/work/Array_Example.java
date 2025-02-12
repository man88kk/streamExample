package work;

import java.util.*;

public class Array_Example {
    public static void main(String[] args) {

        // example given by psa
        //example of  for loop
//        for(int i = 0 ; i <=5 ; i++){
//            System.out.println(i);
//        }

        // ex. of Scanner class
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.next();
//        System.out.println("your name is : " + name);

        // Wap to enter your pin no. give three times chance after that card is blocked
//      Scanner sc = new Scanner(System.in);
//      for(int i = 0 ; i<3 ; i++) {
//          System.out.println("Enter your pin no ");
//          Integer pin = sc.nextInt();
//          if (pin == 1234) {
//              System.out.println("Please collect the cash");
//              break;
//          }
//          else {
//              System.out.println("Invalid");
//          }
//          if(i==2){
//              System.out.println("card is blocked");
//          }
//       }

        // example of while loop
        // create condition variable
//        int x = 0;
//        // check condition
//        while (x<3){
//            System.out.println(a);
        //change the value of condition variable
        // x++ ;
        //   }

//        Scanner sc = new Scanner(System.in);
//        String cdn = "yes";
//
//        while (cdn.equals("yes")){
//            System.out.println("Enter your amount");
//            int amount  = sc.nextInt();
//            System.out.println("Please collect the cash "+ amount);
//
//        System.out.println("do you want to continue(yes/no");
//        cdn = sc.nextLine();
        //}

        // ex. of do while loop
//        int a = 0;
//        do {
//            System.out.println(a);
//            a++;
//        }
//        while (a<5);

        // ex. of break;
//        for (int i = 0 ; i<=5; i++) {
//            if (i== 2){
//                 continue;
//            }
//            System.out.println(i);
//        }

        // ex. of label break statement
//        for (int i = 0; i <5 ; i++){
//            x: if (i==2) {
//                break x;
//            }
//            System.out.println(i);
//        }
//
//        for (int i = 0; i <5 ; i++){
//            x: if (i==2) {
//                break x;
//            }
//            System.out.println(i);
        //       }

        // ex. of nested loop
//        for (int i = 0; i < 5; i++) {
//            System.out.println("i" + i);
//            for (int j = 0; j < 5; j++) {
//                System.out.println("j" + j);
//            }
//        }
        //
//        for (int i = 5; i>=0; i--){
//            System.out.println(i);
//        }

//        int j =5;
//        for(int i = 0 ; i <=5 ; i++){
//            System.out.println(i);
//            if(j>=0)
//                System.out.println(j);
//            j--;
//        }

        //ex. of array and print the value
//        int[] a = new int[3];
//        a[0] = 10;
//        a[1] = 20;
//        a[2] = 30;
        // by using for loop
//        for(int i = 0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        // by using for each loop
//        for (int x : a){
//            System.out.println(x);
//        }

        //ex. of array and print the String value
//        String[] s = new String[4];
//        s[0] = "Manish";
//        s[1] = "Binu";
//        s[2] ="Chotu";
//        s[3] = "Laddu";
//         for (String a : s){
//             System.out.println(a);
//         }


        // wap to print max and min salary
        //      System.out.println(arr[arr.length-1]);
        //      System.out.println(arr[0]);

        // wap to remove duplicate element
        // this Question is only applicable when element is already sorted
          // o/p = 12345000
//        int[] x = {1,1,2,3,3,4,4,5};
//        int[] y = new int[x.length];
//        int j = 0;
//        for(int i = 0 ; i < x.length-1 ; i++){
//          if(x[i] != x[i+1]){
//              y[j] = x[i];
//              j++;
//          }
//        }
//        y[j] = x[x.length-1];
//        for (int arr  : y){
//            System.out.println(arr);
//        }
        // do not print last zeros

//        System.out.println(j+1);
//       for(int z = 0; z < j+1 ; z++){
//           System.out.println(y[z]);
//       }

        // ex. of 2-D array
        // wap to print length of row and length of column
//        int[][] a = new int[2][3];
//        System.out.println(a.length);
//        System.out.println(a[0].length);

        // wap to print value of 2d array
//        int[][] a = new int[2][3];
//      a[0][0]=1;
//      a[0][1]=2;
//      a[0][2]=3;
//      a[1][0]=4;
//      a[1][1]=5;
//      a[1][2]=6;
//      for (int i = 0 ; i <a.length; i++) {
//          for (int  b =0 ; b < a[0].length; b++) {
//              System.out.println(a[i][b]);
//          }
//      }

        // wap to print the sum of diagonal dialimit
//        int[][] a = new int[3][3];
//        a[0][0]=1;
//        a[0][1]=2;
//        a[0][2]=3;
//        a[1][0]=4;
//        a[1][1]=5;
//        a[1][2]=6;
//        a[2][0]=7;
//        a[2][1]=8;
//        a[2][2]=9;
//        int temp = 0;
//
//        for (int i = 0 ; i <a.length; i++) {
//            for (int  b =0 ; b < a[0].length; b++) {
//                if(i==b){
//                    temp =a[i][b]+temp;
//                }
//            }
//        }
//        System.out.println(temp);

        // Q given array = {2,3,4,5,6,7,8};
        // print output = {2,3,4,6,7,8};
//        int k = 0;
//        int[] arr1 = {2,3,4,5,6,7,8};
//        int[] arr2 = new int[arr1.length-1];
//        for (int i = 0 ; i<arr1.length; i++){
//         if (arr1[i] == 5){
//             continue;
//         }
//            arr2[k] = arr1[i];
//           k++;
//        }
//        for ( int c : arr2){
//            System.out.print(c);
//        }
        // Q - Move all -ve no in start
//        int[] arr = {1, -5, -4, -6, 1, 9, 5, -3, 5,};
//        int[] arr1 = new int[arr.length];
//        int j = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                arr1[j] = arr[i];
//                j++;
//            }
//                }
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] >= 0) {
//                        arr1[j] = arr[i];
//                        j++;
//                    }
//                }
//                for (int a : arr1){
//                    System.out.println(a);
//                }
        // some imp Q by smart programming
        // Q = retrieve data from two-dimensional array
        // lecture no. 7 by smart programming
//        int[][] arr = {{1,2,3},{4,5,6}};
//        for (int i =0 ; i<arr.length; i++){
//            for(int j = 0; j< arr[i].length ; j++){
//                System.out.println(arr[i][j]+ "");
//            }
//        }

       // sort the element of array by using bubble sorting  Lecture = 8
  //      int[] x = {36,19,29,12,5};
//        int temp;
//        for(int i = 0 ; i<x.length ; i++){
//            int flag =0;
//            for(int j = 0 ; j<x.length-1-i ; j++){
//                if(x[j]> x[j+1]){
//                    temp = x[j];
//                    x[j]=x[j+1];
//                    x[j+1]=temp;
//                    flag=1;
//                }
//            }
//            if(flag==0){
////                break;
//            }
//          }
//        for (int c= 0 ; c< x.length ; c++){
//            System.out.println(x[c]+" ");
//        }

        // sort the element of array by using selection sorting  Lecture = 9
//        int[] arr = {36,19,29,12,5};
//        int min , temp = 0;
//        for(int i =0 ; i<arr.length; i++){
//            min =i;
//              for(int j = i+1 ; j<arr.length ; j++) {
//                  if (arr[j]<arr[min]) {
//                     i = min;
//                  }
//              }
//                 temp = arr[i];
//                 arr[i]=arr[min];
//                 arr[min]=temp;
//             }
//             for (int k = 0 ; k<arr.length;k++){
//                 System.out.println(arr[k]);
//             }
             // wap to print the index no. where my item is present by linear search lec - 15
//        int[] arr = {36,19,29,12,5};
//        int item = 29;
//        int temp = 0; // for - if item is not found
//        for(int i =0 ; i< arr.length ; i++){
//            if(arr[i]== temp){
//                System.out.println(i);
//                temp  =temp+1;
//            }
//        }
//        if(temp==0){
//            System.out.println("item is not present");
//        }
//
        // same above for arrays of String
//        String[] arr = {"cat","dog","mouse","rabbit","wolf"};
//        String item = "mouse";
//        int temp = 0; // for - if item is not found
//        for(int i =0 ; i< arr.length ; i++){
//            if(arr[i].equals("mouse")){
//                System.out.println("index position"+i);
//                temp  =temp+1;
//            }
//        }
//        if(temp==0){
//            System.out.println("item is not present");
//        }

        // find 2nd largest element of array, lecture - 18
        // same tarika se 2nd lowest nakal sakte hai asc order mai sarya kar
       // same tarika se kth lowest nikal sakte hai asc order mai sarya kar

//        int[] arr = {6, 3, 5, 6, 7, 11};
//        int temp ;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++){
//                if(arr[i]<arr[j]){
//                    temp = arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//              if(i==1){
//                  break;
//              }
//        }
//        for (int a : arr){
//            System.out.println(a);
//        }
//        System.out.println(arr[1]);

        // Q - print only those no. whose is repeated  by brute force method,lecture - 20
//        int[]  arr=  {38,7, 30, 32, 32,30, 14 ,7};
//        for (int i = 0 ; i < arr.length-1 ; i++){
//            for (int j = i+1 ; j < arr.length ; j++) {
//                if (arr[i] == arr[j] && i!=j) {
//                    System.out.println(arr[i]);
//                }
//            }
//        }

        // 2nd method by using set
//        int[]  arr=  {38,7, 30, 32, 32,30, 14 ,7};
//        Set<Integer> s = new HashSet<>();
//        for (int no : arr){
//            boolean b = s.add(no);
//            if (b==false){
//                System.out.println(no);
//            }
//        }
        // 3nd method by using Map
//        int[]  arr=  {38,7, 30, 32, 32,30, 14 ,7};
//        Map<Integer , Integer > mp = new LinkedHashMap<>();
//        Used mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1) to count occurrences.
//                The getOrDefault method fetches the current count of the
//        key or defaults to 0 if the key does not exist.
//        for (int i = 0; i < arr.length; i++) {
//            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
//        }
//
//        for (Map.Entry<Integer , Integer> map : mp.entrySet()){
//            if (map.getValue()>1){
//                System.out.println(map.getKey());
//            }
              // or you can also print those no who comes only one time
//              if(map.getValue()==1){
//                  System.out.println(map.getKey());
//              }
//        }
         //wap to print first duplicate value in given array
//        int[] arr = {1,2,3,4,543,2,3,5};
//        for(int i = 0 ; i< arr.length-1; i++){
//            int temp = 0;
//            for (int j = i+1  ;j < arr.length ; j++){
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                    temp = temp +1;
//                    break;
//                }
//            }
//            if (temp==1){
//                break;
//            }
//        }

         // another approach by using collection framework
//        int[] arr = {1,2,3,4,543,2,3,5};
//        int temp = -1;
//        Set<Integer> s = new HashSet<>();
//        for(int i =arr.length-1; i>=0 ;i--){
//            if (s.contains(arr[i])){
//                temp =i;
//            }
//            else {
//                s.add(arr[i]);
//            }
//        }
//        if (temp!=-1){
//            System.out.println(arr[temp]);
//        }
//        else {
//            System.out.println("no first duplicate element is not present");
//        }

        // wap to find , size and sum of all even and odd no. in a given array , lecture no = 23
//        int[] arr = {1,2,4,3,6,8,9,5};
//        ArrayList<Integer> al1 = new ArrayList<>();
//        ArrayList<Integer> al2 = new ArrayList<>();
//        for (int i = 0 ; i<arr.length; i++){
//            if(arr[i]%2==0){
//                al1.add(arr[i]);
//            }
//            else {
//                al2.add(arr[i]);
//            }
//        }
//        System.out.println("even no are");
//        int temp = 0;
//        for (int a :al1){
//            System.out.println(a);
//            temp = temp +a;
//        }
//        System.out.println("size of even no:-" +al1.size());
//        System.out.println("sum of all even no:-"+ temp);
//
//        System.out.println("odd no are :-");
//        int tepm2=0;
//        for (int b :al2){
//          tepm2= tepm2+b;
//            System.out.println(b);
//        }
//        System.out.println("size of all odd no:-"+ al2.size());
//        System.out.println("Sum of all odd no:-"+ tepm2);

        // find the missing no. from the given array ; lecture no =24
//        int[] arr= {1,2,3,3,5};
//        int n = arr.length;
//        int expectedSum = n*(n+1)/2;
//        int actualSum = 0;
//        for(int num: arr) {
//            actualSum = actualSum + num;
//        }
//        int missingNo = expectedSum+3-actualSum;
//        System.out.println(missingNo);

        //
        // find all  missing no.
//        int[] arr = {1,3,5,7};
//        System.out.println("Missing elements:");
//        findMissingElements(arr);
//    }
//    // complexity= O(n*n)
//    public static void findMissingElements(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {  // 1,3,5
//            int current = arr[i];  // 1 -3 -5
//            int next = arr[i + 1]; // 3 -5 -7
//
//            // Check for missing elements between current and next
//            for (int j = current + 1; j < next; j++) {   // j=1+1=2 - 3+1=4 - 5+1=6
//                System.out.print(j + " ");
//            }
//        }
        // find common element in two array, lecture no = 25;
//         int[] arr1 = {1,2,3,4,5,6,7};
//         int[] arr2 = {1,3,5,9,10,4,3};
//         Set<Integer> s = new HashSet<>();
//         for(int i = 0 ; i<arr1.length ;i++){
//             for (int j = 0 ; j<arr2.length ; j++){
//                if(arr1[i]==arr2[j]){
//                    s.add(arr1[i]);
//                    break;
//                }
//             }
//         }
//        System.out.println(s);

        // wap to print a subsequence of an array , Lecture = 27
         // given array {3,9,1 ,10 ,4 ,20 ,2}
           // o/p {1,2,3,4} , {9,10} , {20};
//        int[] arr = {3,9,1 ,10 ,4 ,20 ,2};
//        HashSet<Integer> hs = new HashSet<>();
//        for(int i =0 ; i < arr.length ; i++)
//        {
//             hs.add(arr[i]);
//        }
//        int long_leng = 0;
//        for (int i= 0 ; i<arr.length ; i++){
//            if(!hs.contains(arr[i]-1)){
//                int no = arr[i];
//                while (hs.contains(no)){
//                    no++;
//                }
//                if(long_leng< no-arr[i]){
//                    long_leng= no-arr[i];
//                }
//            }
//        }
//        System.out.println("Longest SubSequence "+ long_leng);

        // Lecture 28

        // WAP to insert an element into an array at specific position, lecture 29
//        int[] arr = {10,20,30,40,50,60,70,80,90};
//        int element = 100;
//        int position = 5;
//        for(int i = arr.length-1; i>position-1 ; i--){
//            arr[i]=arr[i-1];
//        }
//        arr[position-1] =element;
//        for (int i = 0 ; i< arr.length ; i++){
//            System.out.print(arr[i]+" ");
//        }

        // wap to print  to delete a specific  element from an array
//        int[] arr  = {10, 40 , 30 ,80 ,60 ,20};
//        int deleteItem = 100;
//        int count  =0;
//        for(int i = 0 ; i<arr.length ; i++){
//            if(arr[i]== deleteItem){
//               for (int j = i ; j<arr.length-1 ; j++){
//                   arr[j]=arr[j+1];
//               }
//                count= count+1;
//                break;
//            }
//        }
//        if (count==0){
//            System.out.println("deleted item not present");
//        }
//        else {
//            System.out.println("delete item successfully");
//            for (int i = 0 ; i<arr.length ;i++){
//                System.out.println(arr[i]);
//            }
//        }
             // lecture = 31
        // Wap to print only non-repeated value
        // we can apply this if the given array is an unsorted
//        int[] arr = {1,2,3,4,5,6,54,4,3,4,6,3};
//        for(int i = 0 ; i< arr.length ; i++){
//            for(int j = 0 ; j<arr.length-1 ; j++){
//                if(arr[j]>arr[j+1])
//                {
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int k = 0 ; k< arr.length -1 ; k++){
//            if(arr[k]!=arr[k+1]){
//                System.out.println(arr[k]);
//            }
//        }
//        System.out.println(arr[arr.length-1]);

      // 2nd approach by collection framework
//        int[] arr = { 1,3,4,5,3,5,76 ,4};
//        HashSet<Integer > hs =new HashSet<>();
//        for (int i =0 ; i< arr.length ; i++){
//            hs.add(arr[i]);
//        }
//        for (int j : hs){
//            System.out.println(j);
//        }
        // some important interview question on array by Ashok it

        // Q - merge two arrays
//        int[] a = {1,2,3};
//        int[] b = {4,5,6};
//        int[] c = new int[a.length+b.length];
//        for(int i =0; i<a.length ; i++){
//            c[i] = a[i];
//            // c[] = 1,2,3,0,0,0
//        }
//        for(int i =0; i<b.length ; i++){
//            c[i+a.length] = b[i];
//            // c[] = 1,2,3,4,5,6
//        }
//        System.out.println(Arrays.toString(c));

        // wap to sort an array
        // wap to sort an element of array;
//        int[]  arr=  {38, 30, 32, 14 ,7};
//        for (int i = 0 ; i < arr.length-1 ; i++){
//            for (int j = 0 ; j < arr.length-1 ; j++){
//              if  (arr[j] > arr[j+1]){
//                  int temp = arr[j];
//                  arr[j] = arr[j+1];
//                  arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int x : arr) {
//            System.out.println(x);
//        }

        // approach 2 - by using collection framework
//        int[]  arr=  {38, 30, 32, 14 ,7};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));





        // wap to print only repeated no.
//        int[] arr = {1, 2, 3, 3, 5};
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        for (int num: arr){
//            if(map.containsKey(num)){
//                map.put(num,map.get(num)+1);
//            }
//            else {
//                map.put(num,1);
//            }
//        }
//      for (Map.Entry<Integer,Integer> mp : map.entrySet()){
//          if (mp.getValue()>1){
//              System.out.println(mp.getKey());
//          }
//      }

        // in the above q print those no which comes only one time
//        for (Map.Entry<Integer,Integer> mp : map.entrySet()){
////          if (mp.getValue()==1){
////              System.out.println(mp.getKey());
////          }
////      }


//        //find min and max no. of array
//        int[] arr = {1,3,2,5,6,3,7,9};
//        int min = arr[0];
//        int max = arr[0];
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);


    }
}




