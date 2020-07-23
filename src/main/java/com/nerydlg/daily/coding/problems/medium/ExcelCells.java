package com.nerydlg.daily.coding.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class ExcelCells {
    // Implement a method get and a method set such that
    // given a set of operations you can get the result
    // i.e:
    //    set(A, 1)
    //    get(A) -> 1
    //    set(B, 9)
    //    get(B) -> 9
    //    set(C, A+B)
    //    get(C) -> 10
    // NOTE: by default empty cells  = 0
    static class Expression<T> {
        private final T value;

        public Expression(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }

        public boolean isEmpty() {
            return value == null;
        }
    }

    private Map<String, Expression> map = new HashMap<>();

    public void set(String key, Object val) {
        Expression expression = null;
        if (val instanceof Integer) {
            expression = new Expression<Integer>((Integer) val);
        } else if (val instanceof String) {
            expression = new Expression<String>((String) val);
        }
        map.put(key, expression);
    }

    public int get(String key) {
        Expression val = map.get(key);
        if (val != null && val.get() != null) {
            if (val.get() instanceof Integer) {
                return (Integer) val.get();
            }
            if (val.get() instanceof String) {
                String expr = (String) val.get();
                if (expr.indexOf("+") > 0) {
                    String[] sums = expr.split("\\+");
                    return get(sums[0]) + get(sums[1]);
                } else if (expr.indexOf("-") > 0) {
                    String[] subs = expr.split("-");
                    return get(subs[0]) - get(subs[1]);
                } else if (expr.indexOf("*") > 0) {
                    String[] subs = expr.split("\\*");
                    return get(subs[0]) * get(subs[1]);
                } else {
                    String[] subs = expr.split("/");
                    return get(subs[0]) / get(subs[1]);
                }
            }
        }

        return 0;
    }


    public int size() {
        return map.size();
    }

}
