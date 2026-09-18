package com.nerydlg.daily.coding.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ExpressionEvaluator {
    Map<String, Integer> variables = new HashMap<>();

    enum ExpressionType {
        ASIGN,
        BINARY
    }

    enum Operator {
        NONE,
        MULT,
        ADD,
        SUB,
        LET
    }

    class Expression {
        ExpressionType type;
        Operator operator;
        Expression valA;
        Expression valB;
        int val;
        Expression(){
        }

        Expression(int val){
            type = ExpressionType.ASIGN;
            operator = Operator.NONE;
            this.val = val;
        }

        int getVal() {
            return type == ExpressionType.ASIGN ? this.val : eval();
        }

        int eval() {
            switch(operator){
                case ADD:
                    val = valA.getVal() + valB.getVal();
                    break;
                case SUB:
                    val = valA.getVal() - valB.getVal();
                    break;
                case MULT:
                    val = valA.getVal() * valB.getVal();
                    break;
            }
            return val;
        }
    }

    /**
     * Evaluates string expression coming in the following way:
     * expression = "( LET X ( ADD 5 2 ) ) ( MULT X 3 )";
     * expression = "( ADD 5 2 )";
     * expression = "( LET X ( ADD 5 2 ) ) ( LET Y ( MULT 8 3 ) ) ( MULT X Y )";
     * @param expression
     * @return
     */
    public int evaluate(String expression) {
        // tokenize the input
        List<String> tokens = tokenize(expression);
        // convert input into expressions
        Stack<Expression> stack = extractExpressions(tokens);
        return 0;
    }

    private Stack<Expression> extractExpressions(List<String> tokens) {
        Stack<Expression> stack = new Stack<>();
        Expression expr = null;
        for (String token : tokens) {
            if (token.equals(")")){
                if (expr == null) {
                    expr = new Expression();
                } else {
                    if(expr.valA == null) {
                        expr.valA = new Expression();
                        stack.push(expr);
                        expr = expr.valA;
                    } else if(expr.valB == null) {
                        expr.valB = new Expression();
                        stack.push(expr);
                        expr = expr.valB;
                    }
                }
            } else if (token.equals(")")) {
                stack.push(expr);
                expr = null;
            } else if (token.matches("[ADD|LET|MULT|SUB]")){
                expr.operator = Operator.valueOf(token);
                expr.type = !token.equals("LET")? ExpressionType.BINARY : ExpressionType.ASIGN;
            } else if (token.matches("\\d+")){
                if(expr.valA == null) {
                    expr.valA = new Expression(Integer.valueOf(token));
                } else {
                    expr.valB = new Expression(Integer.valueOf(token));
                }
            } else {

            }
        }
        return stack;
    }

    public List<String> tokenize(String expression) {
        return Arrays.asList(expression.split("\\s+"));
    }
}
