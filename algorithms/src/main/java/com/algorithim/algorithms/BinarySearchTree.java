package com.algorithim.algorithms;

public class BinarySearchTree {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 6, 7 };
    System.err.println(binarySearch(arr, 7, 0, arr.length - 1));
  }

  public static int binarySearch(int[] arr, int k, int low, int high) {
    int mid = (low + high) / 2;
    if (k == arr[mid]) return mid;
    if (k > arr[mid]) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
    return binarySearch(arr, k, low, high);
  }
}
