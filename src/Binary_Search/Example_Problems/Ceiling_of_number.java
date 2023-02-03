package Binary_Search.Example_Problems;

// Ceiling of a number
// The Smallest number greater or equal to target.

public class Ceiling_of_number {

    static int Ceiling(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        if(target>arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else return mid;
        }
        return start;

    }

    public static void main(String[] args) {

        int[] arr = {2,4,6,9,12,17,19,22};
        int target = 15;
        System.out.println(Ceiling(arr,target));

    }
}
