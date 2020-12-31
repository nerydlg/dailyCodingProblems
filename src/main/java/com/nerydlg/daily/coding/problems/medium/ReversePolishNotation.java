package com.nerydlg.daily.coding.problems.medium;

import java.util.Set;
import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        Set<String> operators = Set.of("+", "-", "*", "/");

        while(i < tokens.length) {
            if(!operators.contains(tokens[i])) {
                stack.push(Integer.valueOf(tokens[i]));
            } else {
                String operator = tokens[i];
                int b = stack.pop();
                int a = stack.pop();
                switch(operator) {
                    case "+": stack.push(sum(a, b));
                        break;
                    case "*": stack.push(multi(a, b));
                        break;
                    case "/": stack.push(div(a, b));
                        break;
                    case "-": stack.push(sub(a, b));
                        break;
                    default:
                        break;
                }
            }
            i++;
        }
        return stack.pop();
    }

    private int sum(int a, int b) {
        return a + b;
    }

    private int multi(int a, int b) {
        return a * b;
    }

    private int div(int a, int b) {
        return a / b;
    }

    private int sub(int a, int b) {
        return a - b;
    }
}
