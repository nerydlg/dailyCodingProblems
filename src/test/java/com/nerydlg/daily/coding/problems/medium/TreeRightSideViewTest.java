package com.nerydlg.daily.coding.problems.medium;

import com.nerydlg.daily.coding.problems.common.TreeNode;
import com.nerydlg.daily.coding.problems.util.TreeNodeDeserializer;
import com.nerydlg.daily.coding.problems.util.TreeNodeSerializer;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeRightSideViewTest {

    private TreeRightSideView subject;

    @Test
    void canFindViewFromRightSide() {
        // GIVEN
        Integer[]  tree = new Integer[]{1,2,3,null,5,null,4};
        TreeNode root = TreeNodeDeserializer.deserialize(tree);
        subject = new TreeRightSideView();
        List<Integer> expected = List.of(1, 3, 4);
        // WHEN
        List<Integer> resultBFS = subject.rightSideViewBFS(root);
        List<Integer> resultDFS = subject.rightSideViewDFS(root);
        // THEN
        assertIterableEquals(expected, resultBFS);
        assertIterableEquals(resultBFS, resultDFS);
    }

    @Test
    void canFindViewFromRightSide2() {
        // GIVEN
        Integer[]  tree = new Integer[]{1, 3, null};
        TreeNode root = TreeNodeDeserializer.deserialize(tree);
        subject = new TreeRightSideView();
        List<Integer> expected = List.of(1, 3);
        // WHEN
        List<Integer> resultBFS = subject.rightSideViewBFS(root);
        List<Integer> resultDFS = subject.rightSideViewDFS(root);
        // THEN
        assertIterableEquals(expected, resultBFS);
        assertIterableEquals(resultBFS, resultDFS);
    }

    @Test
    void canFindViewFromRightSideFromEmpty() {
        // GIVEN
        Integer[]  tree = new Integer[]{};
        TreeNode root = TreeNodeDeserializer.deserialize(tree);
        subject = new TreeRightSideView();
        List<Integer> expected = List.of();
        // WHEN
        List<Integer> resultBFS = subject.rightSideViewBFS(root);
        List<Integer> resultDFS = subject.rightSideViewDFS(root);
        // THEN
        assertIterableEquals(expected, resultBFS);
        assertIterableEquals(resultBFS, resultDFS);
    }
}