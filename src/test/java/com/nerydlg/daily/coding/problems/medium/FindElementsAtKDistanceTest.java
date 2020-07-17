package com.nerydlg.daily.coding.problems.medium;


import com.nerydlg.daily.coding.problems.common.TreeNode;
import com.nerydlg.daily.coding.problems.util.TreeNodeDeserializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FindElementsAtKDistanceTest {

    private FindElementsAtKDistance kDistance;

    @Test
    void findKDistanceTest1() {
        kDistance = new FindElementsAtKDistance();
        List<Integer> expected = Arrays.asList(1, 7, 4);
        Integer[] input = new Integer[]{3,5,1,6,2,0,8,null,null,7,4};
        TreeNode tree = TreeNodeDeserializer.deserialize(input);
        int k = 2;
        TreeNode target = tree.left; // 5
        List<Integer> result = kDistance.distanceK(tree, target, k);
        Assertions.assertIterableEquals(result, expected);
    }


    @Test
    void findKDistanceTest2() {
        kDistance = new FindElementsAtKDistance();
        List<Integer> expected = Arrays.asList(2);
        Integer[] input = new Integer[]{0, 2, 1, null, null, 3};
        TreeNode tree = TreeNodeDeserializer.deserialize(input);
        int k = 3;
        TreeNode target = tree.right.left; // 3
        List<Integer> result = kDistance.distanceK(tree, target, k);
        Assertions.assertIterableEquals(result, expected);
    }

}