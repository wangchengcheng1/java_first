package com.whc;

import java.util.Random;

public class chouJiang {

  public static void main(String[] args) {
    Random r = new Random();
    int[] originArr = { 10, 20, 30, 40, 50 };
    int[] newArr = new int[originArr.length];
    for (int i = 0; i < originArr.length;) {
      int randomItem = originArr[r.nextInt(originArr.length)];
      //   System.out.println(randomItem);
      if (!hasOrNot(newArr, randomItem)) {
        newArr[i] = randomItem;
        i++;
      }
    }
    for (int j = 0; j < newArr.length; j++) {
      System.out.println(newArr[j]);
    }
  }

  public static boolean hasOrNot(int[] arr, int item) {
    boolean flag = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == item) {
        flag = true;
      }
    }
    return flag;
  }
}
