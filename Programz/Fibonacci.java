package Programz;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
//        fibonacci(20);
//        printFibonacci(20);
        printFibonacciRecursion(0,1,10);
    }

    static void fibonacci(int num){
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(a);
            a = b;
            b = c;
            c = a+b;
        }
    }

    static void printFibonacci(int num){
        Stream.iterate(new long[] {0,1},f -> new long[] {f[1],f[0]+f[1]}).limit(num).forEach(e -> System.out.println(e[0]));
    }

    static void printFibonacciRecursion(int a, int b,int num) {
        if(num > 0){
            System.out.println(a);
            printFibonacciRecursion(b,a+b,num-1);
        }
    }
}
