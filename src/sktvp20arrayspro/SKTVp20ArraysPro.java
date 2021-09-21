
package sktvp20arrayspro;

import java.util.Arrays;


public class SKTVp20ArraysPro {

   
    public static void main(String[] args) {
       int[]nums; //int nums[];
       nums = new int[5];
       nums[0] = 1;
       nums[1] = 2;
       nums[2] = 3;
       nums[3] = 4;
       nums[4] = 5;
       System.out.println("nums = " + Arrays.toString(nums));
       
       
       int nums2[];
       nums2 = Arrays.copyOf(nums, 7);
        System.out.println("nums2 = " + Arrays.toString(nums2));
        System.out.print("nums2 = ["); 
        for( int i=0; i<nums2.length; i++){
            System.out.printf("%d", nums2[i]);
            if (i<nums2.length-1) {
            System.out.print(", ");
        }

    }
        System.out.println("]");
     }
    

