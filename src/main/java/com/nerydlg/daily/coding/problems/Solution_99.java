package com.nerydlg.daily.coding.problems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution_99 {
    

        public static void main(String[] args){
            int[][] servers = {
                    { 0, 0, 0, 1 },
                    { 0, 0, 1, 0 },
                    { 0, 0, 1, 0 },
                    { 0, 0, 1, 0 }
            };

            System.out.println(howManyDaysToUpdate(servers, 4, 4));
        }

        public static int howManyDaysToUpdate(int[][] servers, int cols, int rows) {
            int matrixSize = cols * rows;
            int pending = 1;
            int[][] nextDay = null;
            int days = 0;
            while(pending > 0 && pending != matrixSize) {
                pending = matrixSize;
                nextDay = new int[rows][cols];
                for(int row = 0; row < servers.length; row++) {
                    for(int col = 0; col < servers[row].length; col++){
                        if(goingToBeUpdated(servers, col, row)) {
                            nextDay[row][col] = 1;
                            pending--;
                        } else {
                            nextDay[row][col] = servers[row][col];
                            if(servers[row][col] == 1) {
                                pending--;
                            }
                        }
                    }
                }
                if(pending == matrixSize) {
                    //days = -1;
                    break;
                }
                days++;
                printNextDay(nextDay);
                servers = nextDay;
            }
            return days;
        }

        public static void printNextDay(int[][] nextDay) {
            Arrays.stream(nextDay)
                .map(row -> Arrays
                        .stream(row)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(",")))
                 .forEach(System.out::println);

            System.out.println("---------------DAY----------");
        }


        public static boolean goingToBeUpdated(int[][] servers, int col, int row) {
            int current = servers[row][col];
            if (current == 1) { // it is already updated
                return false;
            }
            return (col > 0 && servers[row][col - 1] == 1)  // check left
                    || (col < servers[row].length - 1 && servers[row][col + 1] == 1) //check right
                    || (row > 0 && servers[row - 1][col] == 1) // check top
                    || (row < servers.length - 1 && servers[row + 1][col] == 1); // check bottom
        }
}
