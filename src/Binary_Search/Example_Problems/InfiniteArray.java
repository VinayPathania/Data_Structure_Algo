package Binary_Search.Example_Problems;

// Find the target in the infinite array.
// Infinite => You don't know the end of the array

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,13,15,17,19,24,27,34};
        int target = 15;
        System.out.println(findArray(target,arr));
    }

    static int findArray(int target, int[] arr){
        // find the range
        // start with the box of size 0;
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            end = end+(end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr,start,end,target);
    }

    static int binarySearch(int[] arr, int start, int end, int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else return mid;
        }
        return -1;
    }

}
