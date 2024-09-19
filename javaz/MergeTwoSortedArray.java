package javaz;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
      int[] nums1 ={1,2,3,0,0,0},nums2={2,5,6};
      int m=3, n=3;
      nums1=merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

       int i=m-1;
       int j=n-1;
       int k = m+n-1;
       while (j >= 0 ){
           if(nums1[i] > nums2[j] && i >= 0){
               nums1[k] = nums1[i];
               i--;
               k--;
           }else {
               nums1[k] = nums2[j];
               j--;
               k--;
           }
       }


      return nums1;
    }
}
