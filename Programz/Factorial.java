package Programz;

public class Factorial {
    public static void main(String[] args) {
        long factorial = factorial(5);
        System.out.println(factorial);
    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
