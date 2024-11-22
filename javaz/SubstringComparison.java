package javaz;

import java.util.Arrays;
import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int k = sc.nextInt();
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i <= str.length() -k; i++) {
//            res.append(str.substring(i, i + k)).append(" ");
//        }
//
//        String[] arr = res.toString().split(" ");
//        Arrays.sort(arr);
//
//        System.out.println(arr[0]);
//        System.out.println(arr[arr.length - 1]);

        System.out.println(print());

    }

    public static String print(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        String current_substring = str.substring(0,k);
        String smallest = current_substring;
        String largest  = current_substring;

        for (int i = 1; i <= str.length() - k; i++) {
            current_substring = str.substring(i,i+k);
            if(current_substring.compareTo(largest) > 0){
                largest = current_substring;
            }else{
                smallest =  current_substring;
            }
        }

        return smallest + "\n" +largest;
    }


}
