package Binary_Search;

public class BS_Algo_Asc {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,15,17,36,48};
        int target = 36;
        System.out.println(binarySearch(arr,target));
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                System.out.print("The index of target element in the array = ");
                return mid;
            }
        }
        return -1;
    }

}
