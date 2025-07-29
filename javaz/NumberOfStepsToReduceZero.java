package javaz;

public class NumberOfStepsToReduceZero {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(noOfSteps(num));
    }

    public static int noOfSteps(int num){
        return helper(num, 0);
    }

    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        if(n % 2 == 0){
            return helper(n/2,count+1);
        }

        return helper(n-1,count+1);
    }
}
