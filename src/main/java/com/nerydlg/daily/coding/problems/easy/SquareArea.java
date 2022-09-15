package com.nerydlg.daily.coding.problems.easy;

import java.util.Arrays;

public class SquareArea {

  public int getLargestPiece(String coord, int[] sliceX, int[] sliceY) {
    String[] size = coord.split(",");
    int x = Integer.valueOf(size[0]);
    int y = Integer.valueOf(size[1]);

    Arrays.sort(sliceX);
    Arrays.sort(sliceY);

    int newX = getValueFrom(sliceX, x);
    int newY = getValueFrom(sliceY, y);

    return newX * newY;
  }

  private int getValueFrom(int[] slice, int x){
    int result = 0;
    if(slice.length == 0) {
      result = x;
    } else if(slice.length == 1) {
      result = x - slice[0];
    } else {
      result = Math.max(Math.max(slice[1] - slice[0], x - slice[1]), slice[0]);
    }
    return result;
  }

  /*****
   *     |   | *
   *****/
}