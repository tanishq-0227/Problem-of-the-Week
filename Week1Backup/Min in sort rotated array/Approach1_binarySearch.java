// Approach 2: Binary Search (Efficient for Sorted Rotated Arrays)
// Time Complexity: O(log n)

public class Approach2_BinarySearch {
    public static int findMin(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {
            if (arr[lo] < arr[hi])  // Subarray already sorted
                return arr[lo];

            int mid = (lo + hi) / 2;

            if (arr[mid] > arr[hi])  // Min is in the right half
                lo = mid + 1;
            else  // Min is in left half or could be mid
                hi = mid;
        }
        return arr[lo];
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(findMin(arr));
    }
}
