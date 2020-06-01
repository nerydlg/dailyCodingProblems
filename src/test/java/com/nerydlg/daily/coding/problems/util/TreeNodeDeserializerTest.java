package com.nerydlg.daily.coding.problems.util;


import com.nerydlg.daily.coding.problems.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class TreeNodeDeserializerTest {

    @Test
    void canDeserializeFromArray() {
        Integer[] input = {10,5,-3,3,2,null,11,3,-2,null,1};
        /**
         *  Input represents a Tree like this:
         *             10
         *           /    \
         *          5     -3
         *        /  \      \
         *      3     2      11
         *     / \     \
         *    3  -2     1
         */
        TreeNode result = TreeNodeDeserializer.deserialize(input);
        assertNotNull(result);
        // root
        assertEquals(10, result.val);
        // level 1
        assertEquals(5, result.left.val);
        assertEquals(-3, result.right.val);
        // level 2
        assertEquals(3, result.left.left.val);
        assertEquals(2, result.left.right.val);
        assertNull(result.right.left);
        assertEquals(11, result.right.right.val);
        // level 3
        assertEquals(3, result.left.left.left.val);
        assertEquals(-2, result.left.left.right.val);
        assertEquals(1, result.left.right.right.val);
    }
}