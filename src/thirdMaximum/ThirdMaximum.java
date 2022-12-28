package thirdMaximum;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximum {
    public static void main(String[] args) {
        int[] maximum = {2, 2, 3, 1};
        System.out.println(thirdMax(maximum));
    }
            public static int thirdMax(int[] nums) {
                Arrays.sort(nums,0,nums.length);

                int count=0;
                int max=nums[nums.length-1];
                for(int i=nums.length-2;i>=0;i--)   {
                    if(count==2)    break;
                    if(nums[i]<max) {
                        count++;
                        max=nums[i];
                    }
                }
                if(count==2)    return max;
                return nums[nums.length-1];
            }
        }