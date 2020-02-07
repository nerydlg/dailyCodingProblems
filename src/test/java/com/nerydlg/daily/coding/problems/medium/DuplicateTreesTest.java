package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

class DuplicateTreesTest {

    DuplicateTrees subject = new DuplicateTrees();

    @Test
    void findDuplicates_1() {
//          R  L   R  L   R    L      R
//        [ 0 ,0 , 0, 0, null ,null , 0, null, null, null, 0]

//                   0
//              0        0
//          0     null null  0
//
//
//
//
        DuplicateTrees.TreeNode root = new DuplicateTrees.TreeNode(0,
                new DuplicateTrees.TreeNode(0, new DuplicateTrees.TreeNode(0, null, null), null),
                new DuplicateTrees.TreeNode(0, null, new DuplicateTrees.TreeNode(0, null, new DuplicateTrees.TreeNode(0, null, null)))
        );

        subject.findDuplicateSubtrees(root);
    }
}