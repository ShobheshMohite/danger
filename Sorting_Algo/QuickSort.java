package Sorting_Algo;

//Quick Sort = Divide And Conquer

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = { 15, 9, 7, 13, 12, 16, 4, 18, 11 };
    int length = arr.length;

    QuickSort qs = new QuickSort();
    qs.quickSortRecurssion(arr, 0, length - 1);
    qs.printArr(arr);

  }

  public int partition(int[] arr, int low, int high) {
    int pivot = arr[low];

    while (low <= high) {
      while (arr[low] < pivot) {
        low++;
      }
      while (arr[high] > pivot) {
        high--;
      }
      if (low <= high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        low++;
        high--;
      }
    }
    return low;
  }

  void quickSortRecurssion(int[] arr, int low, int high) {
    int pi = partition(arr, low, high);
    if (low < pi - 1) {
      quickSortRecurssion(arr, low, pi - 1);
    }
    if (pi < high) {
      quickSortRecurssion(arr, pi, high);
    }
  }

  void printArr(int[] a) {
    for (int i : a) {
      System.out.print(i + " ");
    }
  }
}
