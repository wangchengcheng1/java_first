package com.whc;

public class compa {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] newArr = filterArrFn(arr, 3, 7);
    for (int i = 0; i < newArr.length; i++) {
      System.out.println(newArr[i]);
    }
  }

  public static int[] filterArrFn(int[] arr, int from, int to) {
    int[] filterArr = new int[to - from + 1];

    return filterArr;
  }
}
