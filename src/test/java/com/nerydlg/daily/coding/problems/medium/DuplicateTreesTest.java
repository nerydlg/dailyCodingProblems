package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateTreesTest {

    DuplicateTrees subject = new DuplicateTrees();

    @Test
    void findDuplicates() {
//          R  L   R  L   R    L      R
//        [ 0 ,0 , 0, 0, null ,null , 0, null, null, null, 0]

//                   0
//              0        0
//          0     null null  0
//                        null 0
//
//
//
        DuplicateTrees.TreeNode root = new DuplicateTrees.TreeNode(0,
                new DuplicateTrees.TreeNode(0, new DuplicateTrees.TreeNode(0, null, null), null),
                new DuplicateTrees.TreeNode(0, null, new DuplicateTrees.TreeNode(0, null, new DuplicateTrees.TreeNode(0, null, null)))
        );

        List<DuplicateTrees.TreeNode> result = subject.findDuplicateSubtrees(root);
        assertEquals(1, result.size());
    }

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
                new DuplicateTrees.TreeNode(0, null, new DuplicateTrees.TreeNode(0, null, null))
        );

        List<DuplicateTrees.TreeNode> result = subject.findDuplicateSubtrees(root);
        assertEquals(1, result.size());
    }



    @Test
    void findDuplicates_2() {
//          R  L   R  L   R    L      R
//        [ 0 ,0 , 0, 0, null ,null , 0, null, null, null, 0]

//                   1
//            2             3
//       4       null    2     4
//                     4

        DuplicateTrees.TreeNode root = new DuplicateTrees.TreeNode(1,
                new DuplicateTrees.TreeNode(2, new DuplicateTrees.TreeNode(4, null, null), null),
                new DuplicateTrees.TreeNode(3, new DuplicateTrees.TreeNode(2, new DuplicateTrees.TreeNode(4, null, null), null), new DuplicateTrees.TreeNode(0, null, null))
        );

        List<DuplicateTrees.TreeNode> result = subject.findDuplicateSubtrees(root);
        assertEquals(2, result.size());
    }
}