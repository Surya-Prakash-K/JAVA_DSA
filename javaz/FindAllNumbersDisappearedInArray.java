package javaz;


import java.util.*;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(arr);
//        System.out.println(ans);
        System.out.println(find(arr).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while ( i < arr.length ){
            int correct_index = arr[i]- 1;
            if(arr[i]!= arr[correct_index]){
                swap(arr,i,correct_index);
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j+1){
                list.add(j+1);
            }
        }

        return list;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    public static List<Integer> find(int[] arr){
        Set<Integer> map=new HashSet<>();

        for(int i:arr)
        {
            map.add(i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=arr.length;i++)
        {
            if(!(map.contains(i)))
            {
                list.add(i);
            }
        }
        return list;
    }

}
