package com.Algorithms.BinarySearch;

public class rotatedSortedArray_dupli {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,7};
        int target = 3;
        System.out.println(findPivot(arr));

        int ans = searchTarget(arr, target);
        System.out.println(ans);
    }

    // 🔍 Search target using pivot
    static int searchTarget(int[] arr, int target) {
        int pivot = findPivot(arr);

        // If no rotation
        if (pivot == -1) {
            return binSearch(arr, target, 0, arr.length - 1);
        }

        // If target is pivot
        if (arr[pivot] == target) {
            return pivot;
        }

        // Decide which half to search
        if (target >= arr[0]) {
            return binSearch(arr, target, 0, pivot - 1);
        } else {
            return binSearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    // 🔥 Find pivot in rotated array (handles duplicates)
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: pivot found
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: pivot found
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: duplicates → shrink range
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {

                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Case 4: left side sorted → pivot on right
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }

            // Case 5: right side sorted → pivot on left
            else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // 🔍 Standard binary search
    static int binSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}