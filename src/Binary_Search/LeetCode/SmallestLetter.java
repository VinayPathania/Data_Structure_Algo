package Binary_Search.LeetCode;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

// description
// You are given an array of characters letters that is sorted in non-decreasing order, and a
// character target. There are at least two different characters in letters.
//
// Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.

public class SmallestLetter {
    public static void main(String[] args) {
       char[] letters = {'c','f','j'};
       char target = 'j';
        System.out.println(smallestChar(letters,target));
    }

    private static char smallestChar(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(target<letters[mid]){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        if(s==letters.length){
            return letters[0];
        }
        return letters[s];
    }
}
