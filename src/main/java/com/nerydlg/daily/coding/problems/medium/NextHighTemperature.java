package com.nerydlg.daily.coding.problems.medium;

import java.util.Stack;

public class NextHighTemperature {

    public int[] dailyTemperatures(int[] temperatures) { // [1, 2, 3, 4, 3, 5]
        Stack<Integer> stack = new Stack<>();
        int [] result = new int[temperatures.length];
        // iterate over the whole array
        for(int i=0; i < temperatures.length; i++) {
            // keep iterating until stack is empty or we found a higher temperature than the current temp
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                // pop index value
                int index = stack.pop();
                // set index minus current i to get the difference
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
