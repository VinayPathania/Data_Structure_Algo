package Binary_Search.Example_Problems;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6,6,7,8,9};
        int target = 6;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }


    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }
        return ans;
    }

    static int search(int[] nums,int target, boolean firstIndex){
        int ans = -1;
        int s =0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target<nums[mid]){
                e = mid-1;
            }
            else if(target>nums[mid]){
                s = mid+1;
            }
            else{
                ans = mid;
                if(firstIndex){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
        }
        return ans;
    }
}
