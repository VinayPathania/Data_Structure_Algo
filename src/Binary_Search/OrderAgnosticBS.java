package Binary_Search;

// OrderAgnostic mean when you don't know the order of the array whether it is in ascending order or descending order.

// First check whether the array is sorted in ascending or descending order.

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {89,76,65,44,37,12,9,7,4,2,1};
        int target = 9;
        System.out.println(OABs(arr,target));
    }
    public static int  OABs(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end = mid-1;
                }
                else start = mid+1;
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else start = mid+1;
            }
        }
        return -1;
    }
}
