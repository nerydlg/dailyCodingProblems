package com.nerydlg.daily.coding.problems.medium;


import com.nerydlg.daily.coding.problems.common.TreeNode;
import com.nerydlg.daily.coding.problems.util.TreeNodeDeserializer;
import com.nerydlg.daily.coding.problems.util.TreeNodeSerializer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DeleteNodeInBSTTest {

    DeleteNodeInBST subject = new DeleteNodeInBST();

    @Test
    void deleteNodeThatIsNotLeaf() {
        // GIVEN
        Integer[] tree = new Integer[]{5, 3, 6, 2, 4, null, 7};
        Integer[] expected = new Integer[]{5, 4, 6, 2, null, null, 7};
        TreeNode input = TreeNodeDeserializer.deserialize(tree);
        // WHEN
        TreeNode result = subject.deleteNode(input, 3);
        // THEN
        Integer[] actual = TreeNodeSerializer.serialize(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    void deleteNodeThatIsALeaf() {
        // GIVEN
        Integer[] tree = new Integer[]{5, 3, 6, 2, 4, null, 7};
        Integer[] expected = new Integer[]{5, 3, 6, 2, 4};
        TreeNode input = TreeNodeDeserializer.deserialize(tree);
        // WHEN
        TreeNode result = subject.deleteNode(input, 7);
        // THEN
        Integer[] actual = TreeNodeSerializer.serialize(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    void deleteNodeThatDoesntExists() {
        // GIVEN
        Integer[] tree = new Integer[]{5, 3, 6, 2, 4, null, 7};
        Integer[] expected = new Integer[]{5, 3, 6, 2, 4, null, 7};
        TreeNode input = TreeNodeDeserializer.deserialize(tree);
        // WHEN
        TreeNode result = subject.deleteNode(input, 0);
        // THEN
        Integer[] actual = TreeNodeSerializer.serialize(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    void deleteNodeOnAnEmptyTree() {
        // GIVEN
        Integer[] tree = new Integer[]{};
        Integer[] expected = new Integer[]{};
        TreeNode input = TreeNodeDeserializer.deserialize(tree);
        // WHEN
        TreeNode result = subject.deleteNode(input, 0);
        // THEN
        Integer[] actual = TreeNodeSerializer.serialize(result);
        assertArrayEquals(expected, actual);
    }
}