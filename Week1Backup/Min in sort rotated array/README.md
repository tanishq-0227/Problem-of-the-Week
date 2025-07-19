Problem: Find the Minimum in a Sorted and Rotated Array


~ Example:

Input: [3,4,5,1,2]
Output: 1


~ Approaches

  Approach 1: Binary Search
- Use binary search to reduce time.
- If the subarray is already sorted, return `arr[lo]`.
- Otherwise, compare `arr[mid]` with `arr[hi]` to decide the direction.

Time Complexity: O(log n)  
Space Complexity: O(1)


  Approach 2: Linear Search
- Traverse the array from start to end.
- Keep track of the minimum element.

Time Complexity: O(n)  
Space Complexity: O(1)