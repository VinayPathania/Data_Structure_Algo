package Binary_Search.LeetCode;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeekInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int end = arr.length-1;
        while(s<end){
            int mid = s+(end-s)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else s = mid+1;
        }
        return arr[s];
    }
}
