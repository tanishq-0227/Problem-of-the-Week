Problem:  Subarray Sum Equals K



~  Example 1:

Input:
nums = [1, 2, 3]
k = 3

Output:
2

Explanation:
Subarrays = [1, 2] and [3]



~  Example 2:

Input:
nums = [1, 1, 1]
k = 2

Output:
2

Explanation:
Subarrays = [1, 1] at indices (0,1) and (1,2)



  Approach 1: Brute Force

- Use nested loops to check **every possible subarray** and sum it.
- If sum equals `k`, increase count.

Time Complexity: O(n²)  
Space Complexity: O(1)


  Approach 2: Prefix Sum + HashMap (Efficient)

- Maintain a **running sum**.
- Use a **HashMap** to store how many times each prefix sum has occurred.
- If `(sum - k)` exists in the map, it means a subarray sum of `k` ends at the current index.


~  Key Insight:
> If `sum(0..j) - sum(0..i-1) == k`, then `sum(i..j) == k`.

~  Steps:
1. Initialize `sum = 0`, `count = 0`, and `map = {0: 1}`.
2. Loop through array:
   - Update sum.
   - Check if `(sum - k)` is in map → Add its frequency to `count`.
   - Update map with current sum.

Time Complexity: O(n)  
Space Complexity: O(n)
