package Programz;

public class DiamondPatternProgram {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
    /*


  * * * * 5 * * * *
  * * * 5 4 5 * * *
  * * 5 4 3 4 5 * *
  * 5 4 3 2 3 4 5 *
  5 4 3 2 1 2 3 4 5
  * 5 4 3 2 3 4 5 *
  * * 5 4 3 4 5 * *
  * * * 5 4 5 * * *
  * * * * 5 * * * *

     * * 3 * *
     * 3 2 3 *
     3 2 1 2 3
     * 3 2 3 *
     * * 3 * *

     */



    static void printPattern(int n){
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }
    }


























//    static void printPattern(int value){
//        int length = 2 * value;
//        for(int i = 1; i<length; i++){
//            ArrayList<String> arrayList = new ArrayList<>(length);
//            for (int j = 1; j < length-1; j++) {
//                arrayList.add(String.valueOf('*'));
//            }
//            int index = value - i;
//            if(index >= 0){
//                arrayList.add(index, String.valueOf(value));
//                int count = value - index;
//                if(count>1){
//                    arrayList.add(index+1, String.valueOf(value-1));
//                    arrayList.add(index+2, String.valueOf(value));
//                }
//            }else{
//                int count = value + index;
//                arrayList.add(i-value, String.valueOf(value));
//                if(count < 1){
//                    arrayList.add(index - 1, String.valueOf(value-1));
//                    arrayList.add(index+2, String.valueOf(value));
//                }
//            }
//            System.out.println(arrayList.toString());
//        }
//
//    }
}
