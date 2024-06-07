package work;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
        //  Swap to no. without using third variable
//        int a = 10;
//        int b = 15;
//        a = a + b;
//        b = a-b;
//        a = a - b;
//        System.out.println("After swap"+" Value of a is "+ a +" Value of b is "+ b );

        // WAP to print whether no. is Palimdrome or not
//        int no = 12321;
//        if(isPalimdrome(no)){
//            System.out.println(no + " is palimdrome");
//             }
//        else {
//            System.out.println(no + " is not palimdrome");
//        }
//    }
//    public  static  boolean isPalimdrome(int no){
//        int reverse = 0;
//         int originalNumber = no;
//        while (no != 0){
//            int  digit = no%10;
//            reverse = reverse*10 + digit;
//            no = no/10;
//        }
//        return  reverse == originalNumber;

        // WAP to print whether string is Palimdrome or not
//        String str = "madam";
//        if (isPalimdrome(str)) {
//            System.out.println(str + " is palimdrome");
//        } else {
//            System.out.println(str + " is not palimdrome");
//        }
//    }
//
//    public static boolean isPalimdrome(String str) {
//        int left = 0;
//        int right = str.length() - 1;
//        while (left < right / 2) {
//            if (str.charAt(left) != str.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;

        //wap to check whether no. is armstrong or not
//        int no = 153;
//        if(isArmstrong(no)){
//            System.out.println(no + " is Armstrong");
//        }
//        else {
//            System.out.println(no + " is not Armstrong");
//        }
//    }
//    public  static  boolean isArmstrong(int no){
//        int sum = 0;
//        int digitlen = String.valueOf(no).length();
//        int originalno = no;
//        while (no > 0){
//             int digit  = no % 10;
//            sum += Math.pow(digit, digitlen);
//            no /=10;
//        }
//        return sum == originalno;

        // wap to check given series is  Fibonacci or not
//        int[] sequence = {1, 1, 2, 3, 5, 8, 13, 21, 34};
//        if(isFebonacci(sequence)){
//            System.out.println("The sequence is a valid Fibonacci series.");
//        }
//        else {
//            System.out.println("The sequence is a not valid Fibonacci series.");
//        }
//
//    }
//    public  static  boolean isFebonacci(int[] sequence){
//        if(sequence.length <3){
//            return false;
//        }
//        for (int i = 2; i<sequence.length; i++){
//           if(sequence[i] != sequence[i-1]+sequence[i-2]){
//               return  false;
//           }
//        }
//        return  true;
    }

}



