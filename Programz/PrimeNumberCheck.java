package Programz;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        System.out.println(isPrime(5));
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= num / 2; i++) {
          if(num % i == 0)
              return false;
        }

        return true;
    }
}


