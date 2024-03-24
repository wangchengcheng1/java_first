package com.whc;

import java.util.Random;

public class compa {

  public static void main(String[] args) {
    System.out.println(code());
  }

  public static String code() {
    String str = "";
    Random r = new Random();
    char[] charArr = new char[52];
    for (int i = 0; i < 52; i++) {
      if (i >= 26) {
        charArr[i] = (char) (i + 97 - 26);
      } else {
        charArr[i] = (char) (i + 65);
      }
    }
    /* for (int j = 0; j < charArr.length; j++) {
      System.out.print(charArr[j] + " ");
    } */
    byte round = 4;
    for (int j = 0; j < round; j++) {
      int randIndex = r.nextInt(charArr.length);
      // System.out.println(randIndex);
      char randChar = charArr[randIndex];
      str += randChar;
    }
    int randNumber = r.nextInt(10);
    str += randNumber;
    return str;
  }
}
