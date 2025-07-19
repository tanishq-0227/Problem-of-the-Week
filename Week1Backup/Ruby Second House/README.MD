Problem: Ruby Second House


- Example:
Input:
2 3
1 5 3
2 9 4

Output:
5

~ Explanation:

Paint house 0 with color 0 (1) and house 1 with color 2 (4) → 1+4 = 5

Or paint house 0 with color 2 (3) and house 1 with color 0 (2) → 3+2 = 5

~ Approach: Optimized DP using Min Tracking
This Java solution uses Dynamic Programming with two variables to track:

min1: index of the smallest cost in the previous row

min2: index of the second smallest cost

~ Key Idea
For each house and each color:

If j != min1, then use cost[i][j] += cost[i-1][min1]

Else use cost[i][j] += cost[i-1][min2]

This avoids re-checking all k colors per house, reducing time complexity.


Time Complexity: O(n * k)
Space Complexity: O(1) (in-place update)