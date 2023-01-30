# Binary Search---
    Binary Search is a searching technique that is used for searching a item in very large database with very less amount of time.
- Binary Search will always work for a sorted array.
- If the array is not sorted then first you have to sort it.

## How does Binary Search work?
- First sort the array if not sorted.
- Take two pointers start and end, start = 1st element in array and end  = last element in the array.
- Find middle of the element.  middle = start(end-start)/2;
- if(middle > target) => search in left , else search in right.
- if(middle==target) => middle = ans//.