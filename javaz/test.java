package javaz;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
      int[] arr4 = {56 ,63 ,87 ,24 ,32 ,13 ,15 ,19 ,44 ,52};
      int res = even_odd(arr4);
      int[] arr2 = { 3, 2, 5, 4, 7, 6, 9, 8, 11, 10, 13, 12, 15, 14, 17, 16,
              19, 18, 21, 20, 23, 22, 25, 24, 27, 26, 29, 28, 31, 30, 33, 32,
              35, 34, 37, 36, 39, 38, 41, 40, 43, 42, 45, 44, 47, 46, 49, 48,
              51, 50, 53, 52, 55, 54, 57, 56, 59, 58, 61, 60, 63, 62, 65, 64,
              67, 66, 69, 68, 71, 70, 73, 72, 75, 74, 77, 76, 79, 78, 81, 80,
              83, 82, 85, 84, 87, 86, 89, 88, 91, 90, 93, 92, 95, 94, 97, 96,
              99, 98, 101, 100, 103, 102, 105, 104, 107, 106, 109, 108, 111,
              110, 113, 112, 115, 114, 117, 116, 119, 118, 121, 120, 123, 122,
              125, 124, 127, 126, 129, 128, 131, 130, 133, 132, 135, 134, 137,
              136, 139, 138, 141, 140, 143, 142, 145, 144, 147, 146, 149, 148,
              151, 150, 153, 152, 155, 154, 157, 156, 159, 158, 161, 160, 163
      };

        System.out.println(res);
        int res3 = sol();
        System.out.println(res3);
    }

    public static int even_odd(int[] A) {
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                evenCount+=A[i];
            }else{
                oddCount+=A[i];
            }
        }
        int result = evenCount - oddCount;
        return result;
    }

    public static int solve(int[] A) {
        int result = 0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1]){
                result = 1;
            }else {
                result = 0;
                break;
            }
        }
        return result;
    }

    public static int sol(){
        int[] arr = {0, 2, 4, 1, 3};
        for(int i = 0; i < arr.length; i++)
            arr[i] = arr[(arr[i] + 3) % arr.length];
        for (int num : arr){
            System.out.println(num);
        }
        return 0;
    }


        public int noOfDays(int A, int B, int C) {
        int before = A+B;
        while (before >= 0){
             before-= C;
        }
          return before;
        }


    public static int[] solve(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int maxIndex = row+col;
        int[] res = new int[maxIndex];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i]= A[i][j]+A[i][j+1];
                break;
            }

        }
        for(int j=0;j<col;j++){
            int sum = 0;
            for(int i=0;i<row;i++){
                sum += A[i][j];
            }
            res[row+j]=sum;
        }

        return res;
    }
}


