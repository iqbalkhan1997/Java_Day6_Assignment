package com.blz.day6_Assignment;
    import java.util.Scanner;
public class PrimeNumber {
    void checkPrime(int number){
        int i=0,isPrime=1;
        for(i=2;i<number/2;i++) {
            if (number % i == 0) {
                System.out.println("Entered number is not a prime number");
                isPrime = 0;
                break;
            }
        }
        if(isPrime==1){
            System.out.println("Entered number is prime number");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to check whether it is prime or not");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        PrimeNumber check= new PrimeNumber();
        check.checkPrime(num);
    }
}
