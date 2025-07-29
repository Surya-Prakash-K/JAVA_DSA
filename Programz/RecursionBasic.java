package Programz;

public class RecursionBasic {
    public static void main(String[] args) {
        System.out.println(revNum(321));
    }

    static void print(int n){
        if(n == 0) return;
        System.out.println(n);
        print(n-1);
    }

    static void print2(int n){
        if(n==0) return;
        print2(n-1);
        System.out.println(n);
    }

    static int printFact(int n){
        if(n == 1){
            return 1;
        }

       return n * printFact(n - 1);
    }

   static int printSum(int n){
        if(n == 0) return 0;
        int rem = n % 10;
        int num = n / 10;
        return printSum(num) + rem;
   }

    static int printProduct(int n){
        if(n == 0) return 0;
        int rem = n % 10;
        int num = n / 10;
        return printSum(num) * rem;
    }

    static int revNum(int n){
        int digits = (int) (Math.log10(n))+1; //return how many digits are there
        return revHelper(n, digits);

    }

    static int revHelper(int n, int digits){
        if(n%10 == n){
            return n;

        }
        int rem = n % 10;
        int pow = (int) Math.pow(10,digits-1);
        return rem * pow + revHelper(n/10, digits-1);
    }


}
