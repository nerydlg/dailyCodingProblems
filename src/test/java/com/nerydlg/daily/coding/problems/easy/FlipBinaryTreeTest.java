package com.nerydlg.daily.coding.problems.easy;


import org.junit.jupiter.api.Test;

class FlipBinaryTreeTest {

    private FlipBinaryTree subject = new FlipBinaryTree();

    @Test
    void can_flipTree() {
        FlipBinaryTree.Node  root = new FlipBinaryTree.Node(1,
                new FlipBinaryTree.Node(2,
                        new FlipBinaryTree.Node(4,
                                new FlipBinaryTree.Node(6,null, null),
                                new FlipBinaryTree.Node(7, null, null)),
                        new FlipBinaryTree.Node(5, null, null)),
                new FlipBinaryTree.Node(3, null, null));



        //subject.flipBinaryTree(root);
    }
}