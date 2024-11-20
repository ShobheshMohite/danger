package Sorting_Algo;

//Merge Sort = Divide And Conquer

public class MergeSort {
  int[] array;
  int[] tempMergArr;
  int length;

  public static void main(String[] args) {
    int[] a = { 10, 70, 50, 66, 23, 94, 81 };
    MergeSort ms = new MergeSort();
    ms.sort(a);

    for (int i : a) {
      System.out.print(i + " ");
    }
  }

  public void sort(int[] a) {
    this.array = a;
    this.length = a.length;
    this.tempMergArr = new int[length];
    divideArray(0, length - 1);
  }

  public void divideArray(int lowerIndex, int higherIndex) {
    if (lowerIndex < higherIndex) {
      int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
      // it will sort left side of an array
      divideArray(lowerIndex, middle);

      // it will sort right side of an array
      divideArray(middle + 1, higherIndex);

      mergeArr(lowerIndex, middle, higherIndex);
    }
  }

  public void mergeArr(int lowerIndex, int middle, int higherIndex) {
    for (int i = lowerIndex; i <= higherIndex; i++) {
      tempMergArr[i] = array[i];
    }
    int i = lowerIndex;
    int j = middle + 1;
    int k = lowerIndex;

    while (i <= middle && j <= higherIndex) {
      if (tempMergArr[i] <= tempMergArr[j]) {
        array[k] = tempMergArr[i];
        i++;
      } else {
        array[k] = tempMergArr[j];
        j++;
      }
      k++;
    }
    while (i <= middle) {
      array[k] = tempMergArr[i];
      k++;
      i++;
    }

  }
}
