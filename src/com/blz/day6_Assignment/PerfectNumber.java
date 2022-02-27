package com.blz.day6_Assignment;
    import java.util.Scanner;
public class PerfectNumber {

        static long isPerfect(long num) {
            int i=1;
            long sum=0;
            while (i <= num / 2) {
                if (num % i == 0) {
                    sum = sum + i;
                }
                i++;
            }
            return sum;
        }
        public static void main(String[] args){
            System.out.println("Enter the number to check whether it is perfect or not");
            Scanner in = new Scanner(System.in);
            long perfect;
          long number = in.nextLong();
          perfect = isPerfect(number);
            if(perfect==number){
            System.out.println("Entered number "+number+" is perfect number");
        } else {
            System.out.println("Entered number "+number+" is not a perfect number");
        }
    }
}
