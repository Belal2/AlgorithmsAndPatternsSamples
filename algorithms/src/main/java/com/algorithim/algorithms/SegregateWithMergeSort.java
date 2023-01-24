package com.algorithim.algorithms;

public class SegregateWithMergeSort {

  public static void main(String[] args) {
    int arr[] = {6,-5,12,10,-9,-1};
    segregate(arr, 0, arr.length-1);
    for(int a : arr)
    {
        System.err.print(a+" ");
    }
  }

  public static void segregate(int[] arr, int start, int end) {
    if (end <= start) return;

    int mid = (start + end) / 2;
    segregate(arr, start, mid);
    segregate(arr, mid + 1, end);
    for(int a : arr)
    {
        System.err.print(a+" ");
    }
    merge(arr, start, mid, end);
  }

  public static void merge(int arr[], int start, int mid, int end) {
    int left_length = mid - start + 1;
    int[] left_array = new int[left_length];
    int right_length = end - mid;
    int[] right_array = new int[right_length];

    int i,j;

    for(i=0;i<left_length;i++)
    {
        left_array[i] = arr[start+i];
    }
    
    for(j=0;j<right_length;j++)
    {
        right_array[j] = arr[mid+1+j];
    }

    i=0;
    j=0;
    int k = start;
while(i < left_length && left_array[i] <= 0)
{
arr[k++] = left_array[i++];
}

while(j < right_length && right_array[j] <= 0)
{
arr[k++] = right_array[j++];
}

while(i<left_length)
{
arr[k++] = left_array[i++];
}


while(i<right_length)
{
arr[k++] = right_array[i++];
}



  }
}
