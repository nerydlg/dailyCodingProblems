package com.nerydlg.daily.coding.problems.easy;


import com.nerydlg.daily.coding.problems.common.TreeNode;
import com.nerydlg.daily.coding.problems.util.TreeNodeDeserializer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindParentOfANodeTest {

    private FindParentOfANode subject;

    @Test
    void canFindParentOfANode_1() {
        subject = new FindParentOfANode();
        Integer[] input = new Integer[]{10, 5, 30, null, null, 22, 35 };
        TreeNode tree = TreeNodeDeserializer.deserialize(input);
        TreeNode  k = new TreeNode(5, null, null);

        TreeNode parent = subject.findParent(tree, k);

        assertEquals(parent.val, 10);
    }

    @Test
    void canFindParentOfANode_2() {
        subject = new FindParentOfANode();
        Integer[] input = new Integer[]{10, 5, 30, null, null, 22, 35 };
        TreeNode tree = TreeNodeDeserializer.deserialize(input);
        TreeNode  k = new TreeNode(22, null, null);

        TreeNode parent = subject.findParent(tree, k);

        assertEquals(parent.val, 30);
    }
}