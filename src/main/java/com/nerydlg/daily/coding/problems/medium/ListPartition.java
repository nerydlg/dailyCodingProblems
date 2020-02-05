package com.nerydlg.daily.coding.problems.medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This problem was asked by Amazon.
 *
 * Given a pivot x, and a list lst, partition the list into three parts.
 *
 * The first part contains all elements in lst that are less than x
 * The second part contains all elements in lst that are equal to x
 * The third part contains all elements in lst that are larger than x
 * Ordering within a part can be arbitrary.
 *
 * For example, given x = 10 and lst = [9, 12, 3, 5, 14, 10, 10],
 *  one partition may be [9, 3, 5, 10, 10, 12, 14].
 *
 */
public class ListPartition {

    public List<Integer> partitionList(List<Integer> input, int x) {
        Predicate<Integer> getLessThanX = num -> num.compareTo(x) < 0;
        Predicate<Integer> getEqualThanX = num -> num.compareTo(x) == 0;
        Predicate<Integer> getHigherThanX = num -> num.compareTo(x) > 0;

        List<Integer> result = findJust(input, getLessThanX);

        result.addAll(findJust(input,getEqualThanX));
        result.addAll(findJust(input,getHigherThanX));

        return result;
    }

    public List<Integer> findJust(List<Integer> input, Predicate<Integer> condition){
        return Optional.ofNullable(input)
                .map(Collection::stream)
                .orElse(Stream.empty())
                .filter(condition)
                .collect(Collectors.toList());
    }
}
