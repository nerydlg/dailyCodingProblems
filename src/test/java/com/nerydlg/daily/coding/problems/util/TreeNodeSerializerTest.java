package com.nerydlg.daily.coding.problems.util;


import com.nerydlg.daily.coding.problems.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TreeNodeSerializerTest {


    @Test
    void canSerializeTreeNodeIntoAnArray() {
        Integer[] input = {10,5,-3,3,2,null,11,3,-2,null,1};
        TreeNode tree = TreeNodeDeserializer.deserialize(input);
        Integer[] treeNodeSerializes = TreeNodeSerializer.serialize(tree);
        assertNotNull(treeNodeSerializes);
        assertArrayEquals(input, treeNodeSerializes);
    }
}