package com.nerydlg.daily.coding.problems.easy;


import com.nerydlg.daily.coding.problems.common.TreeNode;
import com.nerydlg.daily.coding.problems.util.TreeNodeDeserializer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PathSumIIITest {

    private PathSumIII subject;

    @Test
    void givenAValidTreeItShouldReturnThreeAsResult() {
        subject = new PathSumIII();
        Integer[] tree = {10,5,-3,3,2,null,11,3,-2,null,1};
        TreeNode input = TreeNodeDeserializer.deserialize(tree);
        int totalPaths = subject.pathSum(input, 8);
        assertEquals(3, totalPaths);
    }

    @Test
    void givenAValidTreeItShouldReturnFourAsResult() {
        subject = new PathSumIII();
        Integer[] tree = {0, 1, 1};
        TreeNode input = TreeNodeDeserializer.deserialize(tree);
        int totalPaths = subject.pathSum(input, 1);
        assertEquals(4, totalPaths);
    }
}