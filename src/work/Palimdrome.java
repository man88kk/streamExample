package work;

import java.util.Scanner;

public class Palimdrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your String");
//        String str = sc.next();
//        String rev = "";
//        int len =str.length();
//        for (int i =len-1; i>=0; i--){
//            rev = rev+str.charAt(i);
//        }
//        if(str.equals(rev))
//        {
//            System.out.println(str + " is Palimdrome");
//        }
//        else {
//            System.out.println(str + " is not Palimdrome");
//        }
        System.out.println("Enter your no.");
        int num = sc.nextInt();

        if(ispalimdrome(num)){
            System.out.println(num + "is palimdrome");
        }
        else {
            System.out.println(num + "is not palimdrome");
        }
    }

        public static boolean ispalimdrome(int num){
            int reverse = 0;
            int original = num;
            while (num != 0){
                int digit =num%10;
                reverse = reverse*10+digit;
                num =num/10;
            }
            return reverse == original;
        }



}
